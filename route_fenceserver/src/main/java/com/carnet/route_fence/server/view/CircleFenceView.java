package com.carnet.route_fence.server.view;

import lombok.Data;

import java.util.Date;

@Data
public class CircleFenceView {
    private Integer fenceId;

    private Integer companyId;

    private Integer fenceType;

    private Date createDate;

    private Date updateDate;

    private Double longitude;

    private Double latitude;

    private Double radius;

}
