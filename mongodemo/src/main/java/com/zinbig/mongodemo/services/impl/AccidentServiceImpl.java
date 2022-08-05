/**
 * Este paquete contiene las implementaciones de los servicios.
 */
package com.zinbig.mongodemo.services.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import com.zinbig.mongodemo.model.AccidentWithDistance;
import com.zinbig.mongodemo.model.LocationWithAmount;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.repositories.AccidentRepositoryMongo;
import com.zinbig.mongodemo.repositories.JpaRepository.AccidentRepositoryPostgres;
import com.zinbig.mongodemo.services.AccidentService;

import org.springframework.data.domain.Pageable;

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
    public List<Accident> accidentsBetweenDates(Date beginDate, Date endDate, int page) {
        Pageable pageWithFiveElements = PageRequest.of(page, 5);
        return this.accidentRepository.findByStartTimeBetween(beginDate, endDate, pageWithFiveElements);
    }

    @Override
    public String mostCommonConditions() {
        String result = "\nAmenity: "+this.accidentRepository.mostCommonConditionAmenity();
        result = result +",\nAstronomicalTwilight: "+ this.accidentRepository.mostCommonConditionAstronomicalTwilight();
        result = result +", \nBump: "+ this.accidentRepository.mostCommonConditionBump();
        result = result +", \nCity: "+ this.accidentRepository.mostCommonConditionCity();
        result = result +", \nCivilTwilight: "+ this.accidentRepository.mostCommonConditionCivilTwilight();
        result = result +", \nCounty: "+ this.accidentRepository.mostCommonConditionCounty();
        result = result +", \nCrossing: "+ this.accidentRepository.mostCommonConditionCrossing();
        result = result +", \nDistanceMi: "+ this.accidentRepository.mostCommonConditionDistanceMi();
        result = result +", \nEndTime: "+ this.accidentRepository.mostCommonConditionEndTime();
        result = result +", \nGiveWay: "+ this.accidentRepository.mostCommonConditionGiveWay();
        result = result +", \nHumidity: "+ this.accidentRepository.mostCommonConditionHumidity();
        result = result +", \nJunction: "+ this.accidentRepository.mostCommonConditionJunction();
        result = result +", \nNoExit: "+ this.accidentRepository.mostCommonConditionNoExit();
        result = result +", \nNoExit: "+ this.accidentRepository.mostCommonConditionNoExit();
        result = result +", \nNuaticalTwilight: "+ this.accidentRepository.mostCommonConditionNuaticalTwilight();
        result = result +", \nNumber: "+ this.accidentRepository.mostCommonConditionNumber();
        result = result +", \nPrecipitation: "+ this.accidentRepository.mostCommonConditionPrecipitation();
        result = result +", \nPressureIn: "+ this.accidentRepository.mostCommonConditionPressureIn();
        result = result +", \nRailway: "+ this.accidentRepository.mostCommonConditionRailway();
        result = result +", \nRoundabout: "+ this.accidentRepository.mostCommonConditionRoundabout();
        result = result +", \nSeverity: "+ this.accidentRepository.mostCommonConditionSeverity();
        result = result +", \nSid: "+ this.accidentRepository.mostCommonConditionSid();
        result = result +", \nStartTime: "+ this.accidentRepository.mostCommonConditionStartTime();
        result = result +", \nState: "+ this.accidentRepository.mostCommonConditionState();
        result = result +", \nStation: "+ this.accidentRepository.mostCommonConditionStation();
        result = result +", \nStop: "+ this.accidentRepository.mostCommonConditionStop();
        result = result +", \nStreet: "+ this.accidentRepository.mostCommonConditionStreet();
        result = result +", \nSunriseSunset: "+ this.accidentRepository.mostCommonConditionSunriseSunset();
        result = result +", \nTemperatureF: "+ this.accidentRepository.mostCommonConditionTemperatureF();
        result = result +", \nTmc: "+ this.accidentRepository.mostCommonConditionTmc();
        result = result +", \nTrafficCalming: "+ this.accidentRepository.mostCommonConditionTrafficCalming();
        result = result +", \nTrafficSignal: "+ this.accidentRepository.mostCommonConditionTrafficSignal();
        result = result +", \nTurningLoop: "+ this.accidentRepository.mostCommonConditionTurningLoop();
        result = result +", \nVisibilityMi: "+ this.accidentRepository.mostCommonConditionVisibilityMi();
        result = result +", \nWeatherCondition: "+ this.accidentRepository.mostCommonConditionWeatherCondition();
        result = result +", \nWindChillF: "+ this.accidentRepository.mostCommonConditionWindChillF();
        result = result +", \nWindDirection: "+ this.accidentRepository.mostCommonConditionWindDirection();
        result = result +", \nWindSpeedMph: "+ this.accidentRepository.mostCommonConditionWindSpeedMph();
        result = result +", \nZipcode: "+ this.accidentRepository.mostCommonConditionZipcode();
        return result;
    }

    @Override
    public List<Accident> accidentsNearAPointInARadius(Double[] point, int radius, int page) {
        Pageable pageWithFiveElements = PageRequest.of(page, 5);
        return accidentRepositoryMongo.accidentsNearAPointInARadius(point, radius, pageWithFiveElements);
    }

    @Override
    public Float averageDistanceOfAccidentsFromBeginningToEnd() {
        return this.accidentRepositoryMongo.averageDistanceOfAccidentsFromBeginningToEnd();
    }

    @Override
    public List<LocationWithAmount> fiveMostDangerousPoints(Double[] point, int radius) {
        return this.accidentRepositoryMongo.fiveMostDangerousPoints(point, radius);
    }

    @Override
    public List<AccidentWithDistance> averageDistanceFromEveryAccidentToTheNearestTen(int page) {
        Pageable pageWithFiveElements = PageRequest.of(page, 5);
        return this.accidentRepositoryMongo.averageDistanceFromEveryAccidentToTheNearestTen(pageWithFiveElements);
    }

    @Override
    public List<String> findByStreetsWithMoreAccidents() {
        return this.accidentRepository.findByStreetsWithMoreAccidents();
    }

}
