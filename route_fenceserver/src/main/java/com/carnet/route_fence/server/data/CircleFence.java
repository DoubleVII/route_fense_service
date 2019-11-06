package com.carnet.route_fence.server.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class CircleFence {

    @Id
    @GeneratedValue
    private Integer fenceId;

    private Double longitude;

    private Double latitude;

    private Double radius;
}
