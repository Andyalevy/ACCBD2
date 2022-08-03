/** Este paquete contiene las clases que representan las entidades del dominio. */
package com.zinbig.mongodemo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="accidents")
public class Accident {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String source;
    private Float tmc;
    private Integer severety;
    private Date startTime;
    private Date endTime;
    private Float startLat;
    private Float startLng;
    private Float endLat;
    private Float endLng;
    private Float distanceMi;
    private String description;
    private Float number;
    private String street;
    private char side;
    private String city;
    private String county;
    private String state;
    private String zipcode;
    private String country;
    private String timezone;
    private String airportCode;
    private String weatherTimestamp;
    @Column(name="temperature_f")
    private Float temperatureF;
    @Column(name="wind_chill_f")
    private String windChillF;
    private String humidity;
    private String pressureIn;
    private Float visibilityMi;
    private String windDirection;
    private Float windSpeedMph;
    private Float precipitationIn;
    private String weatherCondition;
    private Boolean amenity;
    private Boolean bump;
    private Boolean crossing;
    private Boolean giveWay;
    private Boolean junction;
    private Boolean noExit;
    private Boolean railway;
    private Boolean roundabout;
    private Boolean station;
    private Boolean stop;
    private Boolean trafficCalming;
    private Boolean trafficSignal;
    private Boolean turningLoop;
    private String sunriseSunset;
    private String civilTwilight;
    private String nauticalTwilight;
    private String astronomicalTwilight;


    public Accident() {
    }

    public Accident(String id, String source, Float tmc, Integer severety, Date startTime, Date endTime, Float startLat, Float startLng, Float endLat, Float endLng, Float distanceMi, String description, Float number, String street, char side, String city, String county, String state, String zipcode, String country, String timezone, String airportCode, String weatherTimestamp, Float temperatureF, String windChillF, String humidity, String pressureIn, Float visibilityMi, String windDirection, Float windSpeedMph, Float precipitationIn, String weatherCondition, Boolean amenity, Boolean bump, Boolean crossing, Boolean giveWay, Boolean junction, Boolean noExit, Boolean railway, Boolean roundabout, Boolean station, Boolean stop, Boolean trafficCalming, Boolean trafficSignal, Boolean turningLoop, String sunriseSunset, String civilTwilight, String nauticalTwilight, String astronomicalTwilight) {
        this.id = id;
        this.source = source;
        this.tmc = tmc;
        this.severety = severety;
        this.startTime = startTime;
        this.endTime = endTime;
        this.startLat = startLat;
        this.startLng = startLng;
        this.endLat = endLat;
        this.endLng = endLng;
        this.distanceMi = distanceMi;
        this.description = description;
        this.number = number;
        this.street = street;
        this.side = side;
        this.city = city;
        this.county = county;
        this.state = state;
        this.zipcode = zipcode;
        this.country = country;
        this.timezone = timezone;
        this.airportCode = airportCode;
        this.weatherTimestamp = weatherTimestamp;
        this.temperatureF = temperatureF;
        this.windChillF = windChillF;
        this.humidity = humidity;
        this.pressureIn = pressureIn;
        this.visibilityMi = visibilityMi;
        this.windDirection = windDirection;
        this.windSpeedMph = windSpeedMph;
        this.precipitationIn = precipitationIn;
        this.weatherCondition = weatherCondition;
        this.amenity = amenity;
        this.bump = bump;
        this.crossing = crossing;
        this.giveWay = giveWay;
        this.junction = junction;
        this.noExit = noExit;
        this.railway = railway;
        this.roundabout = roundabout;
        this.station = station;
        this.stop = stop;
        this.trafficCalming = trafficCalming;
        this.trafficSignal = trafficSignal;
        this.turningLoop = turningLoop;
        this.sunriseSunset = sunriseSunset;
        this.civilTwilight = civilTwilight;
        this.nauticalTwilight = nauticalTwilight;
        this.astronomicalTwilight = astronomicalTwilight;
    }


    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Float getTmc() {
        return this.tmc;
    }

    public void setTmc(Float tmc) {
        this.tmc = tmc;
    }

    public Integer getSeverety() {
        return this.severety;
    }

    public void setSeverety(Integer severety) {
        this.severety = severety;
    }

    public Date getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Float getStartLat() {
        return this.startLat;
    }

    public void setStartLat(Float startLat) {
        this.startLat = startLat;
    }

    public Float getStartLng() {
        return this.startLng;
    }

    public void setStartLng(Float startLng) {
        this.startLng = startLng;
    }

    public Float getEndLat() {
        return this.endLat;
    }

    public void setEndLat(Float endLat) {
        this.endLat = endLat;
    }

    public Float getEndLng() {
        return this.endLng;
    }

    public void setEndLng(Float endLng) {
        this.endLng = endLng;
    }

    public Float getDistanceMi() {
        return this.distanceMi;
    }

    public void setDistanceMi(Float distanceMi) {
        this.distanceMi = distanceMi;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getNumber() {
        return this.number;
    }

    public void setNumber(Float number) {
        this.number = number;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public char getSide() {
        return this.side;
    }

    public void setSide(char side) {
        this.side = side;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return this.county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getAirportCode() {
        return this.airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    public String getWeatherTimestamp() {
        return this.weatherTimestamp;
    }

    public void setWeatherTimestamp(String weatherTimestamp) {
        this.weatherTimestamp = weatherTimestamp;
    }

    public Float getTemperatureF() {
        return this.temperatureF;
    }

    public void setTemperatureF(Float temperatureF) {
        this.temperatureF = temperatureF;
    }

    public String getWindChillF() {
        return this.windChillF;
    }

    public void setWindChillF(String windChillF) {
        this.windChillF = windChillF;
    }

    public String getHumidity() {
        return this.humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressureIn() {
        return this.pressureIn;
    }

    public void setPressureIn(String pressureIn) {
        this.pressureIn = pressureIn;
    }

    public Float getVisibilityMi() {
        return this.visibilityMi;
    }

    public void setVisibilityMi(Float visibilityMi) {
        this.visibilityMi = visibilityMi;
    }

    public String getWindDirection() {
        return this.windDirection;
    }

    public void setWindDirection(String windDirection) {
        this.windDirection = windDirection;
    }

    public Float getWindSpeedMph() {
        return this.windSpeedMph;
    }

    public void setWindSpeedMph(Float windSpeedMph) {
        this.windSpeedMph = windSpeedMph;
    }

    public Float getPrecipitationIn() {
        return this.precipitationIn;
    }

    public void setPrecipitationIn(Float precipitationIn) {
        this.precipitationIn = precipitationIn;
    }

    public String getWeatherCondition() {
        return this.weatherCondition;
    }

    public void setWeatherCondition(String weatherCondition) {
        this.weatherCondition = weatherCondition;
    }

    public Boolean isAmenity() {
        return this.amenity;
    }

    public Boolean getAmenity() {
        return this.amenity;
    }

    public void setAmenity(Boolean amenity) {
        this.amenity = amenity;
    }

    public Boolean isBump() {
        return this.bump;
    }

    public Boolean getBump() {
        return this.bump;
    }

    public void setBump(Boolean bump) {
        this.bump = bump;
    }

    public Boolean isCrossing() {
        return this.crossing;
    }

    public Boolean getCrossing() {
        return this.crossing;
    }

    public void setCrossing(Boolean crossing) {
        this.crossing = crossing;
    }

    public Boolean isGiveWay() {
        return this.giveWay;
    }

    public Boolean getGiveWay() {
        return this.giveWay;
    }

    public void setGiveWay(Boolean giveWay) {
        this.giveWay = giveWay;
    }

    public Boolean isJunction() {
        return this.junction;
    }

    public Boolean getJunction() {
        return this.junction;
    }

    public void setJunction(Boolean junction) {
        this.junction = junction;
    }

    public Boolean isNoExit() {
        return this.noExit;
    }

    public Boolean getNoExit() {
        return this.noExit;
    }

    public void setNoExit(Boolean noExit) {
        this.noExit = noExit;
    }

    public Boolean isRailway() {
        return this.railway;
    }

    public Boolean getRailway() {
        return this.railway;
    }

    public void setRailway(Boolean railway) {
        this.railway = railway;
    }

    public Boolean isRoundabout() {
        return this.roundabout;
    }

    public Boolean getRoundabout() {
        return this.roundabout;
    }

    public void setRoundabout(Boolean roundabout) {
        this.roundabout = roundabout;
    }

    public Boolean isStation() {
        return this.station;
    }

    public Boolean getStation() {
        return this.station;
    }

    public void setStation(Boolean station) {
        this.station = station;
    }

    public Boolean isStop() {
        return this.stop;
    }

    public Boolean getStop() {
        return this.stop;
    }

    public void setStop(Boolean stop) {
        this.stop = stop;
    }

    public Boolean isTrafficCalming() {
        return this.trafficCalming;
    }

    public Boolean getTrafficCalming() {
        return this.trafficCalming;
    }

    public void setTrafficCalming(Boolean trafficCalming) {
        this.trafficCalming = trafficCalming;
    }

    public Boolean isTrafficSignal() {
        return this.trafficSignal;
    }

    public Boolean getTrafficSignal() {
        return this.trafficSignal;
    }

    public void setTrafficSignal(Boolean trafficSignal) {
        this.trafficSignal = trafficSignal;
    }

    public Boolean isTurningLoop() {
        return this.turningLoop;
    }

    public Boolean getTurningLoop() {
        return this.turningLoop;
    }

    public void setTurningLoop(Boolean turningLoop) {
        this.turningLoop = turningLoop;
    }

    public String getSunriseSunset() {
        return this.sunriseSunset;
    }

    public void setSunriseSunset(String sunriseSunset) {
        this.sunriseSunset = sunriseSunset;
    }

    public String getCivilTwilight() {
        return this.civilTwilight;
    }

    public void setCivilTwilight(String civilTwilight) {
        this.civilTwilight = civilTwilight;
    }

    public String getNauticalTwilight() {
        return this.nauticalTwilight;
    }

    public void setNauticalTwilight(String nauticalTwilight) {
        this.nauticalTwilight = nauticalTwilight;
    }

    public String getAstronomicalTwilight() {
        return this.astronomicalTwilight;
    }

    public void setAstronomicalTwilight(String astronomicalTwilight) {
        this.astronomicalTwilight = astronomicalTwilight;
    }

}