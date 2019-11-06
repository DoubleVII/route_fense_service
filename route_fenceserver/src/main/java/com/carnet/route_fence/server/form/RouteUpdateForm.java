package com.carnet.route_fence.server.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class RouteUpdateForm {

    @NotNull(message = "路线ID必填")
    private Integer routeId;

    @NotEmpty(message = "路线点不能为空")
    private String points;
}
