package com.carnet.route_fence.server.enums;


/**
 * Created by 廖师兄
 * 2017-12-10 17:32
 */
public enum ResultEnum {

    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
