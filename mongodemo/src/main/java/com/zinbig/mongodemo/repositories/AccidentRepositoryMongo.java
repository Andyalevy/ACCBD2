package com.zinbig.mongodemo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.zinbig.mongodemo.model.Accident;

@Repository
public interface AccidentRepositoryMongo extends MongoRepository<Accident, String> {

    @Query("{Start_Time:{$gte:?1, $lt:?2}}")
    public List<Accident> accidentsBetweenDates( Date beginDate, Date endDate);

    //public String mostCommonConditions();
    
    @Query("{location:{$near:{$geometry:{type:'Point',coordinates:[?1]},$maxDistance: ?2,$minDistance:1}}}")
    public List<Accident> accidentsNearAPointInARadius( String point, int radius);

    @Query("[{$group: {_id:null, avg_val:{$avg:'$Distance(mi)'}}}]")
    public int averageDistanceOfAccidentsFromBeginingToEnd();

    //public List<Accident> fiveMostDangerousPoints();

    //public List<Integer> averageDistanceFromEveryAccidentToTheNearestTen();   
}
