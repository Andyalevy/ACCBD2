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
import com.zinbig.mongodemo.model.AccidentWithDistance;
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
        return this.accidentRepository.findByStartTimeBetween(beginDate, endDate);
    }

    @Override
    public String mostCommonConditions() {
        String result = "Amenity: "+this.accidentRepository.mostCommonConditionAmenity();
        result =  result +", AstronomicalTwilight: "+ this.accidentRepository.mostCommonConditionAstronomicalTwilight();
        result = result +", Bump: "+ this.accidentRepository.mostCommonConditionBump();
        result = result +", City: "+ this.accidentRepository.mostCommonConditionCity();
        result = result +", CivilTwilight: "+ this.accidentRepository.mostCommonConditionCivilTwilight();
        result = result +", County: "+ this.accidentRepository.mostCommonConditionCounty();
        result = result +", Crossing: "+ this.accidentRepository.mostCommonConditionCrossing();
        result = result +", DistanceMi: "+ this.accidentRepository.mostCommonConditionDistanceMi();
        result = result +", EndTime: "+ this.accidentRepository.mostCommonConditionEndTime();
        result = result +", GiveWay: "+ this.accidentRepository.mostCommonConditionGiveWay();
        result = result +", Humidity: "+ this.accidentRepository.mostCommonConditionHumidity();
        result = result +", Junction: "+ this.accidentRepository.mostCommonConditionJunction();
        result = result +", NoExit: "+ this.accidentRepository.mostCommonConditionNoExit();
        result = result +", NoExit: "+ this.accidentRepository.mostCommonConditionNoExit();
        result = result +", NuaticalTwilight: "+ this.accidentRepository.mostCommonConditionNuaticalTwilight();
        result = result +", Number: "+ this.accidentRepository.mostCommonConditionNumber();
        result = result +", Precipitation: "+ this.accidentRepository.mostCommonConditionPrecipitation();
        result = result +", PressureIn: "+ this.accidentRepository.mostCommonConditionPressureIn();
        result = result +", Railway: "+ this.accidentRepository.mostCommonConditionRailway();
        result = result +", Roundabout: "+ this.accidentRepository.mostCommonConditionRoundabout();
        result = result +", Severity: "+ this.accidentRepository.mostCommonConditionSeverity();
        result = result +", Sid: "+ this.accidentRepository.mostCommonConditionSid();
        result = result +", StartTime: "+ this.accidentRepository.mostCommonConditionStartTime();
        result = result +", State: "+ this.accidentRepository.mostCommonConditionState();
        result = result +", Station: "+ this.accidentRepository.mostCommonConditionStation();
        result = result +", Stop: "+ this.accidentRepository.mostCommonConditionStop();
        result = result +", Street: "+ this.accidentRepository.mostCommonConditionStreet();
        result = result +", SunriseSunset: "+ this.accidentRepository.mostCommonConditionSunriseSunset();
        result = result +", TemperatureF: "+ this.accidentRepository.mostCommonConditionTemperatureF();
        result = result +", Tmc: "+ this.accidentRepository.mostCommonConditionTmc();
        result = result +", TrafficCalming: "+ this.accidentRepository.mostCommonConditionTrafficCalming();
        result = result +", TrafficSignal: "+ this.accidentRepository.mostCommonConditionTrafficSignal();
        result = result +", TurningLoop: "+ this.accidentRepository.mostCommonConditionTurningLoop();
        result = result +", VisibilityMi: "+ this.accidentRepository.mostCommonConditionVisibilityMi();
        result = result +", WeatherCondition: "+ this.accidentRepository.mostCommonConditionWeatherCondition();
        result = result +", WindChillF: "+ this.accidentRepository.mostCommonConditionWindChillF();
        result = result +", WindDirection: "+ this.accidentRepository.mostCommonConditionWindDirection();
        result = result +", WindSpeedMph: "+ this.accidentRepository.mostCommonConditionWindSpeedMph();
        result = "Zipcode: "+result +", "+ this.accidentRepository.mostCommonConditionZipcode();
        return result;
    }

    @Override
    public List<Accident> accidentsNearAPointInARadius(Double[] point, int radius) {
        return accidentRepositoryMongo.accidentsNearAPointInARadius(point, radius);
    }

    @Override
    public Float averageDistanceOfAccidentsFromBeginningToEnd() {
        return this.accidentRepositoryMongo.averageDistanceOfAccidentsFromBeginningToEnd();
    }

    @Override
    public List<Accident> fiveMostDangerousPoints(Double[] point, int radius) {
        return this.accidentRepositoryMongo.fiveMostDangerousPoints(point, radius);
    }

    @Override
    public List<AccidentWithDistance> averageDistanceFromEveryAccidentToTheNearestTen() {
        return this.accidentRepositoryMongo.averageDistanceFromEveryAccidentToTheNearestTen();
    }

    @Override
    public List<String> findByCitiesWithMoreAccidents() {
        return this.accidentRepository.findByCitiesWithMoreAccidents();
    }

}
