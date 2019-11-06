package com.carnet.route_fence.server.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class FencePoint {

    @Id
    @GeneratedValue
    private Integer fencePointId;

    private Integer FenceId;

    private Double longitude;

    private Double latitude;

    private Integer number;
}
