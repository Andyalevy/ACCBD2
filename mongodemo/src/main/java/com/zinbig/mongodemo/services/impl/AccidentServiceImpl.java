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

@Service
@Transactional
public class AccidentServiceImpl implements AccidentService {

	@Inject
	private AccidentRepositoryPostgres accidentRepository;
    @Inject
    private AccidentRepositoryMongo accidentRepositoryMongo;

    /**
     * @param beginDate fecha de inicio
     * @param endDate fecha de fin
     * @param page número de página
     * @return los accidentes ocurridos entre 2 fechas
     */
    @Override
    public List<Accident> accidentsBetweenDates(Date beginDate, Date endDate, int page) {
        Pageable pageWithFiveElements = PageRequest.of(page, 5);
        return this.accidentRepository.findByStartTimeBetween(beginDate, endDate, pageWithFiveElements);
    }

    /**
     * @return las condiciones más comunes de los accidentes
     */
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

    /**
     * @param point punto
     * @param radius radio
     * @param page número de página
     * @return los accidentes ocurridos dentro de un radio
     */
    @Override
    public List<Accident> accidentsNearAPointInARadius(Double[] point, int radius, int page) {
        Pageable pageWithFiveElements = PageRequest.of(page, 5);
        return accidentRepositoryMongo.accidentsNearAPointInARadius(point, radius, pageWithFiveElements);
    }

    /**
     * @return la distancia promedio desde el inicio al fin del accidente
     */
    @Override
    public Float averageDistanceOfAccidentsFromBeginningToEnd() {
        return this.accidentRepositoryMongo.averageDistanceOfAccidentsFromBeginningToEnd();
    }

    /**
     * @param point punto
     * @param radius radio
     * @return los 5 puntos más peligrosos
     */
    @Override
    public List<LocationWithAmount> fiveMostDangerousPoints(Double[] point, int radius) {
        return this.accidentRepositoryMongo.fiveMostDangerousPoints(point, radius);
    }

    /**
     * @param page número de página
     * @return la distancia promedio que existe entre cada accidente y los 10 más cercanos
     */
    @Override
    public List<AccidentWithDistance> averageDistanceFromEveryAccidentToTheNearestTen(int page) {
        Pageable pageWithFiveElements = PageRequest.of(page, 5);
        return this.accidentRepositoryMongo.averageDistanceFromEveryAccidentToTheNearestTen(pageWithFiveElements);
    }

    /**
     * @return el nombre de las 5 calles con más accidentes
     */
    @Override
    public List<String> findByStreetsWithMoreAccidents() {
        return this.accidentRepository.findByStreetsWithMoreAccidents();
    }

}
