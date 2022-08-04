package com.zinbig.mongodemo.dtos;

import org.springframework.data.mongodb.core.mapping.Field;

public class AccidentWithDistanceDTO {

    private String id;

    @Field("distance")
    private Double distance;

    public AccidentWithDistanceDTO() {
    }

    public AccidentWithDistanceDTO(String id, Double distance) {
        this.id = id;
        this.distance = distance;
    }
}
