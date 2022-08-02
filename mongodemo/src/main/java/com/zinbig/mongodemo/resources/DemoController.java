/**
 * Este paquete contiene las clases que definen la api rest de la aplicación.
 */
package com.zinbig.mongodemo.resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zinbig.mongodemo.model.Accident;
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
	@Inject
	private AccidentService accidentMongoService;

	@GetMapping("/api/accidents/")
    public ResponseEntity<List<Accident>> listAccidents(@RequestParam(required = false) String start,
            @RequestParam(required = false) String end,
            @RequestParam(required = false, defaultValue = "postgres") String name) throws ParseException {
        
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        List<Accident> accidents;
        if (name.equals("mongo")) {
            formatter.setTimeZone(TimeZone.getTimeZone("UTC"));
            Date startD = formatter.parse(start + "T00:00:00");
            Date endD = formatter.parse(end + "T00:00:00");
            accidents = accidentMongoService.accidentsBetweenDates(startD, endD);
        } else {
            Date startD = formatter.parse(start + "T00:00:00");
            Date endD = formatter.parse(end + "T00:00:00");
            accidents = accidentService.accidentsBetweenDates(startD, endD);
        }
        // print total accidents
        System.out.println("Total accidents: " + accidents.size());

        return ResponseEntity.ok(accidents);
    }
}
