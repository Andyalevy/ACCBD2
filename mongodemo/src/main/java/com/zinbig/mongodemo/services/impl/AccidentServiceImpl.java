/**
 * Este paquete contiene las implementaciones de los servicios.
 */
package com.zinbig.mongodemo.services.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zinbig.mongodemo.dtos.DTOFactory;
import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.repositories.AccidentRepository;
import com.zinbig.mongodemo.repositories.AccidentRepositoryMongo;
import com.zinbig.mongodemo.services.AccidentService;

/**
 * Esta clase contiene la implementación de los servicios relacionados con los
 * usuarios.
 * 
 * @author Javier Bazzocco
 *
 */
@Service
@Transactional
public class AccidentServiceImpl implements AccidentService {

	@Autowired
	private AccidentRepository accidentRepository;
    @Autowired
    private AccidentRepositoryMongo accidentRepositoryMongo;

    @Override
    public List<Accident> accidentsBetweenDates(Date beginDate, Date endDate) {
        return this.accidentRepository.accidentsBetweenDates(beginDate, endDate);
    }

    @Override
    public String mostCommonConditions() {
        return null;
    }

    @Override
    public List<Accident> accidentsNearAPointInARadius(String point, int radius) {
        return accidentRepositoryMongo.accidentsNearAPointInARadius(point, radius);
    }

    @Override
    public Float averageDistanceOfAccidentsFromBeginingToEnd() {
        return this.accidentRepository.averageDistanceOfAccidentsFromBeginingToEnd();
    }

    @Override
    public List<Accident> fiveMostDangerousPoints() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Integer> averageDistanceFromEveryAccidentToTheNearestTen() {
        // TODO Auto-generated method stub
        return null;
    }

}
