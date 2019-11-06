package com.carnet.route_fence.server.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class FenceUpdateForm {

    @NotNull(message = "围栏ID必填")
    private Integer fenceId;

    @NotEmpty(message = "围栏点不能为空")
    private String points;
}
