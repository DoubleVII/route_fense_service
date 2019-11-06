package com.carnet.route_fence.server.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class RouteSettingCreateForm {

    @NotEmpty(message = "路线设置列表不能为空")
    private String settings;
}
