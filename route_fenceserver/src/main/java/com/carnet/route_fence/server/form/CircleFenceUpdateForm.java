package com.carnet.route_fence.server.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class CircleFenceUpdateForm {

    @NotNull(message = "围栏ID必填")
    private Integer fenceId;

    @NotNull(message = "纬度必填")
    private Double longitude;

    @NotNull(message = "经度必填")
    private Double latitude;

    @NotNull(message = "半径必填")
    private Double radius;
}
