/**
 * Este paquete contiene las implementaciones de los repositorios personalizados.
 */
package com.zinbig.mongodemo.repositories.impl;

import java.util.Date;
import java.util.List;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.repositories.AccidentRepository;

/**
 * Esta clase implementa los mecanismos personalizados de recuperación de
 * información.
 * 
 * @author Javier Bazzocco
 *
 */
public class AccidentRepositoryImpl implements AccidentRepository {

	// private MongoTemplate mongoTemplate;

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
	public List<Accident> accidentsNearAPointInARadius(String point, int radius) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int averageDistanceOfAccidentsFromBeginingToEnd() {
		// TODO Auto-generated method stub
		return 0;
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
