package com.carnet.route_fence.transfer;

import lombok.Data;

@Data
public class CircleFenceOutput {

    private Integer fenceId;

    private Integer companyId;

    private Double longitude;

    private Double latitude;

    private Double radius;
}
