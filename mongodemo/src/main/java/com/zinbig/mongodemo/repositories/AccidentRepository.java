package com.zinbig.mongodemo.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zinbig.mongodemo.model.Accident;

@Repository
public interface AccidentRepository extends CrudRepository<Accident, String>{

    @Query("select * from accidents where start_date between ?1 and ?2;")
    public List<Accident> accidentsBetweenDates( Date beginDate, Date endDate);

    //public String mostCommonConditions();

    //public List<Accident> accidentsNearAPointInARadius( String point, int radius);

    @Query("select avg(distance_mi) as average from accidents;")
    public Float averageDistanceOfAccidentsFromBeginingToEnd();

    //public List<Accident> fiveMostDangerousPoints();

    //public List<Integer> averageDistanceFromEveryAccidentToTheNearestTen();   

}
