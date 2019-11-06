package com.carnet.route_fence.server.enums;

public enum  FenceTypeEnum {
    CIRCLE(0, "圆形"), POLYGON(1, "多边形");

    private Integer code;

    private String message;

    FenceTypeEnum(Integer code, String message) {
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
