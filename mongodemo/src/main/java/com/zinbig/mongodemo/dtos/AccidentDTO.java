/** Este paquete contiene las clases que representan las entidades del dominio. */
package com.zinbig.mongodemo.dtos;

import java.util.Date;

public class AccidentDTO {

    private String id;
    private String source;
    private Float tmc;
    private Integer severety;
    private Date start_time;
    private Date end_time;
    private Float start_lat;
    private Float start_lng;
    private Float end_lat;
    private Float end_lng;
    private Float distance_mi;
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
    private String airport_code;
    private String weather_timestamp;
    private Float temperature_f;
    private String wind_chill_f;
    private String humidity;
    private String pressure_in;
    private Float visibility_mi;
    private String wind_direction;
    private Float wind_speed_mph;
    private Float precipitation_in;
    private Float weather_condition;
    private Boolean amenity;
    private Boolean bump;
    private Boolean crossing;
    private Boolean give_way;
    private Boolean junction;
    private Boolean no_exit;
    private Boolean railway;
    private Boolean roundabout;
    private Boolean station;
    private Boolean stop;
    private Boolean traffic_calming;
    private Boolean traffic_signal;
    private Boolean turning_loop;
    private String sunrise_sunset;
    private String civil_twilight;
    private String nautical_twilight;
    private String astronomical_twilight;


    public AccidentDTO(String id, String source, Float tmc, Integer severety, Date start_time, Date end_time, Float start_lat, Float start_lng, Float end_lat, Float end_lng, Float distance_mi, String description, Float number, String street, char side, String city, String county, String state, String zipcode, String country, String timezone, String airport_code, String weather_timestamp, Float temperature_f, String wind_chill_f, String humidity, String pressure_in, Float visibility_mi, String wind_direction, Float wind_speed_mph, Float precipitation_in, Float weather_condition, Boolean amenity, Boolean bump, Boolean crossing, Boolean give_way, Boolean junction, Boolean no_exit, Boolean railway, Boolean roundabout, Boolean station, Boolean stop, Boolean traffic_calming, Boolean traffic_signal, Boolean turning_loop, String sunrise_sunset, String civil_twilight, String nautical_twilight, String astronomical_twilight) {
        this.id = id;
        this.source = source;
        this.tmc = tmc;
        this.severety = severety;
        this.start_time = start_time;
        this.end_time = end_time;
        this.start_lat = start_lat;
        this.start_lng = start_lng;
        this.end_lat = end_lat;
        this.end_lng = end_lng;
        this.distance_mi = distance_mi;
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
        this.airport_code = airport_code;
        this.weather_timestamp = weather_timestamp;
        this.temperature_f = temperature_f;
        this.wind_chill_f = wind_chill_f;
        this.humidity = humidity;
        this.pressure_in = pressure_in;
        this.visibility_mi = visibility_mi;
        this.wind_direction = wind_direction;
        this.wind_speed_mph = wind_speed_mph;
        this.precipitation_in = precipitation_in;
        this.weather_condition = weather_condition;
        this.amenity = amenity;
        this.bump = bump;
        this.crossing = crossing;
        this.give_way = give_way;
        this.junction = junction;
        this.no_exit = no_exit;
        this.railway = railway;
        this.roundabout = roundabout;
        this.station = station;
        this.stop = stop;
        this.traffic_calming = traffic_calming;
        this.traffic_signal = traffic_signal;
        this.turning_loop = turning_loop;
        this.sunrise_sunset = sunrise_sunset;
        this.civil_twilight = civil_twilight;
        this.nautical_twilight = nautical_twilight;
        this.astronomical_twilight = astronomical_twilight;
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

    public Date getStart_time() {
        return this.start_time;
    }

    public void setStart_time(Date start_time) {
        this.start_time = start_time;
    }

    public Date getEnd_time() {
        return this.end_time;
    }

    public void setEnd_time(Date end_time) {
        this.end_time = end_time;
    }

    public Float getStart_lat() {
        return this.start_lat;
    }

    public void setStart_lat(Float start_lat) {
        this.start_lat = start_lat;
    }

    public Float getStart_lng() {
        return this.start_lng;
    }

    public void setStart_lng(Float start_lng) {
        this.start_lng = start_lng;
    }

    public Float getEnd_lat() {
        return this.end_lat;
    }

    public void setEnd_lat(Float end_lat) {
        this.end_lat = end_lat;
    }

    public Float getEnd_lng() {
        return this.end_lng;
    }

    public void setEnd_lng(Float end_lng) {
        this.end_lng = end_lng;
    }

    public Float getDistance_mi() {
        return this.distance_mi;
    }

    public void setDistance_mi(Float distance_mi) {
        this.distance_mi = distance_mi;
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

    public String getAirport_code() {
        return this.airport_code;
    }

    public void setAirport_code(String airport_code) {
        this.airport_code = airport_code;
    }

    public String getWeather_timestamp() {
        return this.weather_timestamp;
    }

    public void setWeather_timestamp(String weather_timestamp) {
        this.weather_timestamp = weather_timestamp;
    }

    public Float getTemperature_f() {
        return this.temperature_f;
    }

    public void setTemperature_f(Float temperature_f) {
        this.temperature_f = temperature_f;
    }

    public String getWind_chill_f() {
        return this.wind_chill_f;
    }

    public void setWind_chill_f(String wind_chill_f) {
        this.wind_chill_f = wind_chill_f;
    }

    public String getHumidity() {
        return this.humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getPressure_in() {
        return this.pressure_in;
    }

    public void setPressure_in(String pressure_in) {
        this.pressure_in = pressure_in;
    }

    public Float getVisibility_mi() {
        return this.visibility_mi;
    }

    public void setVisibility_mi(Float visibility_mi) {
        this.visibility_mi = visibility_mi;
    }

    public String getWind_direction() {
        return this.wind_direction;
    }

    public void setWind_direction(String wind_direction) {
        this.wind_direction = wind_direction;
    }

    public Float getWind_speed_mph() {
        return this.wind_speed_mph;
    }

    public void setWind_speed_mph(Float wind_speed_mph) {
        this.wind_speed_mph = wind_speed_mph;
    }

    public Float getPrecipitation_in() {
        return this.precipitation_in;
    }

    public void setPrecipitation_in(Float precipitation_in) {
        this.precipitation_in = precipitation_in;
    }

    public Float getWeather_condition() {
        return this.weather_condition;
    }

    public void setWeather_condition(Float weather_condition) {
        this.weather_condition = weather_condition;
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

    public Boolean isGive_way() {
        return this.give_way;
    }

    public Boolean getGive_way() {
        return this.give_way;
    }

    public void setGive_way(Boolean give_way) {
        this.give_way = give_way;
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

    public Boolean isNo_exit() {
        return this.no_exit;
    }

    public Boolean getNo_exit() {
        return this.no_exit;
    }

    public void setNo_exit(Boolean no_exit) {
        this.no_exit = no_exit;
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

    public Boolean isTraffic_calming() {
        return this.traffic_calming;
    }

    public Boolean getTraffic_calming() {
        return this.traffic_calming;
    }

    public void setTraffic_calming(Boolean traffic_calming) {
        this.traffic_calming = traffic_calming;
    }

    public Boolean isTraffic_signal() {
        return this.traffic_signal;
    }

    public Boolean getTraffic_signal() {
        return this.traffic_signal;
    }

    public void setTraffic_signal(Boolean traffic_signal) {
        this.traffic_signal = traffic_signal;
    }

    public Boolean isTurning_loop() {
        return this.turning_loop;
    }

    public Boolean getTurning_loop() {
        return this.turning_loop;
    }

    public void setTurning_loop(Boolean turning_loop) {
        this.turning_loop = turning_loop;
    }

    public String getSunrise_sunset() {
        return this.sunrise_sunset;
    }

    public void setSunrise_sunset(String sunrise_sunset) {
        this.sunrise_sunset = sunrise_sunset;
    }

    public String getCivil_twilight() {
        return this.civil_twilight;
    }

    public void setCivil_twilight(String civil_twilight) {
        this.civil_twilight = civil_twilight;
    }

    public String getNautical_twilight() {
        return this.nautical_twilight;
    }

    public void setNautical_twilight(String nautical_twilight) {
        this.nautical_twilight = nautical_twilight;
    }

    public String getAstronomical_twilight() {
        return this.astronomical_twilight;
    }

    public void setAstronomical_twilight(String astronomical_twilight) {
        this.astronomical_twilight = astronomical_twilight;
    }

}