/**
 * Este paquete contiene las implementaciones de los servicios.
 */
package com.zinbig.mongodemo.services.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.repositories.AccidentRepositoryMongo;
import com.zinbig.mongodemo.repositories.JpaRepository.AccidentRepositoryPostgres;
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

	@Inject
	private AccidentRepositoryPostgres accidentRepository;
    @Inject
    private AccidentRepositoryMongo accidentRepositoryMongo;

    @Override
    public List<Accident> accidentsBetweenDates(Date beginDate, Date endDate) {
        return this.accidentRepositoryMongo.findByStartTimeBetween(beginDate, endDate);
    }

    @Override
    public String mostCommonConditions() {
        return null;
    }

    @Override
    public List<Accident> accidentsNearAPointInARadius(Double[] point, int radius) {
        return accidentRepositoryMongo.accidentsNearAPointInARadius(point, radius);
    }

    @Override
    public Float averageDistanceOfAccidentsFromBeginingToEnd() {
        return this.accidentRepositoryMongo.averageDistanceOfAccidentsFromBeginingToEnd();
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
