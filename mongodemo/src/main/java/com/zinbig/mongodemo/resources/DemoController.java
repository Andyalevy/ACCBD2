/**
 * Este paquete contiene las clases que definen la api rest de la aplicación.
 */
package com.zinbig.mongodemo.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zinbig.mongodemo.model.Accident;
import com.zinbig.mongodemo.model.AccidentWithDistance;
import com.zinbig.mongodemo.services.AccidentService;

/**
 * Esta clase presenta los diferentes "endpoints" de la api rest.
 * 
 * @author Javier Bazzocco
 *
 */
@RestController
public class DemoController {

	/**
	 * Es el servicio relacionado con los usuarios.
	 */
	@Inject
	private AccidentService accidentService;

	@GetMapping("/api/accidents/betweenDates")
    public ResponseEntity<List<Accident>> listAccidents(
        @RequestParam(required = false, defaultValue = "2016-02-01") String start,
        @RequestParam(required = false, defaultValue = "2016-03-01") String end) throws ParseException {
        
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd");

        List<Accident> accidents;
        //formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
        Date startDate = formatter.parse(start );
        Date endDate = formatter.parse(end );
        accidents = accidentService.accidentsBetweenDates(startDate, endDate);
        System.out.println("Total accidents: " + accidents.size());

        return ResponseEntity.ok(accidents);
    }

    @GetMapping("/api/accidents/averageDistance")
    public ResponseEntity<Float> averageDistanceOfAccidentsFromBeginingToEnd() throws ParseException {
            
        Float averageDistance = accidentService.averageDistanceOfAccidentsFromBeginningToEnd();
        System.out.println("Distancia promedio: " + averageDistance);
        return ResponseEntity.ok(averageDistance);
    }

    @GetMapping("/api/accidents/accidentsNear")
    public ResponseEntity<List<Accident>> accidentsNear(
            @RequestParam(required = false, defaultValue = "-84.032608") String longitud,
            @RequestParam(required = false, defaultValue = "39.063148") String latitud,
            @RequestParam(required = false, defaultValue = "10000") int radius) throws ParseException {
        
        Double[] point = {Double.parseDouble(longitud), Double.parseDouble(latitud)};

        List<Accident> accidentsNear = accidentService.accidentsNearAPointInARadius(point,radius); 
        System.out.println("Accidentes cerca del punto "+ point + ": " + accidentsNear);
        return ResponseEntity.ok(accidentsNear);
    }

    @GetMapping("/api/accidents/citiesWithMoreAccidents")
    public ResponseEntity<List<String>> citiesWithMoreAccidents() throws ParseException {
        
        List<String> cities = this.accidentService.findByCitiesWithMoreAccidents(); 
        System.out.println("Ciudades con más accidentes: "+ cities);
        return ResponseEntity.ok(cities);
    }

    @GetMapping("/api/accidents/fiveMostDangerousPoints")
    public ResponseEntity<List<Accident>> fiveMostDangerousPoints(
        @RequestParam(required = false, defaultValue = "-84.032608") String longitud,
        @RequestParam(required = false, defaultValue = "39.063148") String latitud,
        @RequestParam(required = false, defaultValue = "10000") int radius) throws ParseException {
        
        Double[] point = {Double.parseDouble(longitud), Double.parseDouble(latitud)};
        
        List<Accident> points = this.accidentService.fiveMostDangerousPoints( point, radius); 
        System.out.println("Puntos con más accidentes: "+ points);
        return ResponseEntity.ok(points);
    }

    @GetMapping("/api/accidents/averageDistanceFromEveryAccidentToTheNearestTen")
    public ResponseEntity<List<AccidentWithDistance>> averageDistanceFromEveryAccidentToTheNearestTen() throws ParseException {
        List<AccidentWithDistance> average = this.accidentService.averageDistanceFromEveryAccidentToTheNearestTen();
        return ResponseEntity.ok(average);
    }
}
