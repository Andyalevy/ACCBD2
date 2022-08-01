package com.zinbig.mongodemo.repositories;

import java.util.Date;
import java.util.List;

import com.zinbig.mongodemo.model.Accident;

public interface AccidentRepository {

    public List<Accident> accidentsBetweenDates( Date beginDate, Date endDate);

    public String mostCommonConditions();

    public List<Accident> accidentsNearAPointInARadius( String point, int radius);

    public int averageDistanceOfAccidentsFromBeginingToEnd();

    public List<Accident> fiveMostDangerousPoints();

    public List<Integer> averageDistanceFromEveryAccidentToTheNearestTen();   

}
