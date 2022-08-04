package com.zinbig.mongodemo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.model.AccidentWithDistance;

@Repository
public interface AccidentRepositoryMongo extends MongoRepository<Accident, String> {

    //@Query("{Start_Time:{$gte:?0, $lt:?1}}")
    List<Accident> findByStartTimeBetween( Date beginDate, Date endDate);

    // String mostCommonConditions();
    
    @Query("{location:{$near:{$geometry:{type:'Point',coordinates:?0},$maxDistance: ?1,$minDistance:1}}}")
    List<Accident> accidentsNearAPointInARadius( Double[] point, int radius);

    @Aggregation( pipeline = {"{$group: {_id:null, avg_val:{$avg:'$Distance(mi)'}}}",})
    Float averageDistanceOfAccidentsFromBeginningToEnd();

    @Aggregation( pipeline = {"{$geoNear: {near: { type: 'Point', coordinates: ?0 },distanceField: 'dist.calculated',maxDistance: ?1, spherical: true}}",
    "{$group : {_id: '$location', amount: {$sum: 1}}}",
    "{$sort: {amount:-1}}","{$limit : 5}"})
    List<Accident> fiveMostDangerousPoints(Double[] point, int radius);

    // Esta consulta nos funciona en consola pero no conseguimos que retorne valor valido para 'distancia' a traves de la API.
    @Query("{}.map(function(doc){return db.accident.aggregate([{$geoNear: {near: {type: \"Point\", coordinates: [doc.Start_Lng, doc.Start_Lat]}, distanceField: \"distance\", spherical: true}},{$limit:10}, {$group: {_id:null, distance:{$avg:\"$distance\"}}}, {$set: {_id: doc._id}}]).toArray()[0];})")
    List<AccidentWithDistance> averageDistanceFromEveryAccidentToTheNearestTen();
}
