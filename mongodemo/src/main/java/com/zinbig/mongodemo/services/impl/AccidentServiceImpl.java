/**
 * Este paquete contiene las implementaciones de los servicios.
 */
package com.zinbig.mongodemo.services.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zinbig.mongodemo.dtos.DTOFactory;
import com.zinbig.mongodemo.dtos.AccidentDTO;
import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.repositories.AccidentRepository;
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

    /**
	 * Es el repositorio ligado a los usuarios.
	 */
	@Inject
	private AccidentRepository accidentRepository;

	/**
	 * Es el objeto encargado de crear los DTOs.
	 */
	@Inject
	private DTOFactory dtoFactory;

    @Override
    public List<Accident> accidentsBetweenDates(Date beginDate, Date endDate) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String mostCommonConditions() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<AccidentDTO> accidentsNearAPointInARadius(String point, int radius) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int averageDistanceOfAccidentsFromBeginingToEnd() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<AccidentDTO> fiveMostDangerousPoints() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Integer> averageDistanceFromEveryAccidentToTheNearestTen() {
        // TODO Auto-generated method stub
        return null;
    }

    


}
