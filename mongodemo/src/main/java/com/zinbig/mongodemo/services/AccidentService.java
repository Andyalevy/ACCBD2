package com.zinbig.mongodemo.services;

import java.util.Date;
import java.util.List;

import com.zinbig.mongodemo.dtos.AccidentDTO;

public interface AccidentService {

    public List<AccidentDTO> accidentsBetweenDates( Date beginDate, Date endDate);
    
    public String mostCommonConditions();

    public List<AccidentDTO> accidentsNearAPointInARadius( String point, int radius);

    public int averageDistanceOfAccidentsFromBeginingToEnd();

    public List<AccidentDTO> fiveMostDangerousPoints();

    public List<Integer> averageDistanceFromEveryAccidentToTheNearestTen();
}
