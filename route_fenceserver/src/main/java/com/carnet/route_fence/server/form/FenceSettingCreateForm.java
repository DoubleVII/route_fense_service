package com.carnet.route_fence.server.form;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class FenceSettingCreateForm {

    @NotEmpty(message = "围栏设置列表不能为空")
    private String settings;
}
