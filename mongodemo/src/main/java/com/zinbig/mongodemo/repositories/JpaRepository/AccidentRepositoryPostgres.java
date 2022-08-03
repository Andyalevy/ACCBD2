package com.zinbig.mongodemo.repositories.JpaRepository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zinbig.mongodemo.model.Accident;

@Repository
public interface AccidentRepositoryPostgres extends CrudRepository<Accident, String>{

    List<Accident> findByStartTimeBetween( Date beginDate, Date endDate);

    //String mostCommonConditions();

    //List<Accident> accidentsNearAPointInARadius( String point, int radius);

    //@Query("SELECT avg(distance_mi) AS average FROM accidents")
    //Float averageDistanceOfAccidentsFromBeginingToEnd();

    //List<Accident> fiveMostDangerousPoints();

    //List<Integer> averageDistanceFromEveryAccidentToTheNearestTen();   

}
