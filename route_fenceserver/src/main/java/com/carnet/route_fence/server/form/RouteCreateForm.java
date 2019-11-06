package com.carnet.route_fence.server.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class RouteCreateForm {

    @NotNull(message = "公司ID必填")
    private Integer companyId;

    @NotEmpty(message = "路线点不能为空")
    private String points;
}
