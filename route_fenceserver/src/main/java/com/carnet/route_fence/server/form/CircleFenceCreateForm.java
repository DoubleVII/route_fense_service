package com.carnet.route_fence.server.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class CircleFenceCreateForm {

    @NotNull(message = "公司ID必填")
    private Integer companyId;

    @NotNull(message = "纬度必填")
    private Double longitude;

    @NotNull(message = "经度必填")
    private Double latitude;

    @NotNull(message = "半径必填")
    private Double radius;
}
