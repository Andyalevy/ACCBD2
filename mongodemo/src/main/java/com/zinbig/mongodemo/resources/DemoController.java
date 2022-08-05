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

	//http://localhost:8080/api/accidents/betweenDates?start=2016-01-01&end=2016-02-01&page=0
    @GetMapping("/api/accidents/betweenDates")
    public ResponseEntity<List<Accident>> listAccidents(
        @RequestParam(required = true) String start,
        @RequestParam(required = true) String end,
        @RequestParam(required = true) int page) throws ParseException {
        
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        List<Accident> accidents;
        Date startDate = formatter.parse(start + "T00:00:00");
        Date endDate = formatter.parse(end + "T00:00:00");
        System.out.println(end);
        System.out.println(startDate);
        System.out.println(endDate);

        accidents = accidentService.accidentsBetweenDates(startDate, endDate, page);
        System.out.println("Total accidents: " + accidents.size());

        return ResponseEntity.ok(accidents);
    }

    //http://localhost:8080/api/accidents/averageDistance
    @GetMapping("/api/accidents/averageDistance")
    public ResponseEntity<Float> averageDistanceOfAccidentsFromBeginningToEnd() throws ParseException {
            
        Float averageDistance = accidentService.averageDistanceOfAccidentsFromBeginningToEnd();
        System.out.println("Distancia promedio: " + averageDistance);
        return ResponseEntity.ok(averageDistance);
    }

    //http://localhost:8080/api/accidents/mostCommonConditions
    @GetMapping("/api/accidents/mostCommonConditions")
    public ResponseEntity<String> mostCommonConditions() throws ParseException {

        String mostCommonCondition = this.accidentService.mostCommonConditions();
        System.out.println("Condiciones más comunes: "+ mostCommonCondition);
        return ResponseEntity.ok(mostCommonCondition);
    }

    //"http://localhost:8080/api/accidents/accidentsNear?longitud=-84&latitud=39&radius=10000&page=0"
    @GetMapping("/api/accidents/accidentsNear")
    public ResponseEntity<List<Accident>> accidentsNear(
            @RequestParam(required = true) String longitude,
            @RequestParam(required = true) String latitude,
            @RequestParam(required = true) int radius,
            @RequestParam(required = true) int page) throws ParseException {
        
        Double[] point = {Double.parseDouble(longitude), Double.parseDouble(latitude)};

        List<Accident> accidentsNear = accidentService.accidentsNearAPointInARadius(point,radius,page);
        System.out.println("Accidentes cerca del punto "+ point + ": " + accidentsNear);
        return ResponseEntity.ok(accidentsNear);
    }

    @GetMapping("/api/accidents/fiveStreetsWithMoreAccidents")
    public ResponseEntity<List<String>> fiveStreetsWithMoreAccidents() throws ParseException {
        
        List<String> streets = this.accidentService.findByStreetsWithMoreAccidents();
        System.out.println("Calles con más accidentes: " + streets);
        return ResponseEntity.ok(streets);
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
