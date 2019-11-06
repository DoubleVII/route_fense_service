package com.carnet.route_fence.server.form;


import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
public class FenceCreateForm {

    @NotNull(message = "公司ID必填")
    private Integer companyId;

    @NotEmpty(message = "围栏点不能为空")
    private String points;
}
