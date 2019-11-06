package com.carnet.route_fence.server.exception;

import com.carnet.route_fence.server.enums.ResultEnum;

public class RouteException extends RuntimeException{

    private Integer code;

    public RouteException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public RouteException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
}
