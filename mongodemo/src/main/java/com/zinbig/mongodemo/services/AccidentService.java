package com.zinbig.mongodemo.services;

import java.util.Date;
import java.util.List;

import com.zinbig.mongodemo.model.Accident;

public interface AccidentService {

    public List<Accident> accidentsBetweenDates( Date beginDate, Date endDate);
    
    public String mostCommonConditions();

    public List<Accident> accidentsNearAPointInARadius( Double[] point, int radius);

    public Float averageDistanceOfAccidentsFromBeginingToEnd();

    public List<Accident> fiveMostDangerousPoints();

    public List<Integer> averageDistanceFromEveryAccidentToTheNearestTen();

    public List<String> findByCitiesWithMoreAccidents();
}
