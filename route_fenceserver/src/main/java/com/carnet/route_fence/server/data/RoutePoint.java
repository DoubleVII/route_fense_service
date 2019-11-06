package com.carnet.route_fence.server.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class RoutePoint {

    @Id
    @GeneratedValue
    private Integer routePointId;

    private Integer routeId;

    private Double longitude;

    private Double latitude;

    private Integer number;


}
