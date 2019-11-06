package com.carnet.route_fence.server.view;

import lombok.Data;

/**
 * http请求返回的最外层对象
 */
@Data
public class ResultView<T> {

    /**
     * 错误码
     */
    private Integer coed;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;
}
