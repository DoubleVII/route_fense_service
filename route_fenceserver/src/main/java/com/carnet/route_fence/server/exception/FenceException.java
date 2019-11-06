package com.carnet.route_fence.server.exception;

import com.carnet.route_fence.server.enums.ResultEnum;

public class FenceException extends RuntimeException{

    private Integer code;

    public FenceException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public FenceException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
