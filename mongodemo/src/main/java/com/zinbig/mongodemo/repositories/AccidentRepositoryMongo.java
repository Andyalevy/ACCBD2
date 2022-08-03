package com.zinbig.mongodemo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.zinbig.mongodemo.model.Accident;

@Repository
public interface AccidentRepositoryMongo extends MongoRepository<Accident, String> {

    //@Query("{Start_Time:{$gte:?0, $lt:?1}}")
    List<Accident> findByStartTimeBetween( Date beginDate, Date endDate);

    // String mostCommonConditions();
    
    @Query("{location:{$near:{$geometry:{type:'Point',coordinates:?0},$maxDistance: ?1,$minDistance:1}}}")
    List<Accident> accidentsNearAPointInARadius( Double[] point, int radius);

    @Aggregation( pipeline = {"{$group: {_id:null, avg_val:{$avg:'$Distance(mi)'}}}"})
    Float averageDistanceOfAccidentsFromBeginingToEnd();

    // List<Accident> fiveMostDangerousPoints();

    // List<Integer> averageDistanceFromEveryAccidentToTheNearestTen();   
}
