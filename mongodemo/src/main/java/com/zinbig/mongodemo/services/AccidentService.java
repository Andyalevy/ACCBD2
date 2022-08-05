package com.zinbig.mongodemo.services;

import java.util.Date;
import java.util.List;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.model.AccidentWithDistance;

public interface AccidentService {

    public List<Accident> accidentsBetweenDates( Date beginDate, Date endDate, int page);
    
    public String mostCommonConditions();

    public List<Accident> accidentsNearAPointInARadius( Double[] point, int radius, int page);

    public Float averageDistanceOfAccidentsFromBeginningToEnd();

    public List<Accident> fiveMostDangerousPoints( Double[] point, int radius);

    public List<AccidentWithDistance> averageDistanceFromEveryAccidentToTheNearestTen();

    public List<String> findByCitiesWithMoreAccidents();
}
