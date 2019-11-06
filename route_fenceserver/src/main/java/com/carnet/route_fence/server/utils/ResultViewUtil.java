package com.carnet.route_fence.server.utils;


import com.carnet.route_fence.server.view.ResultView;

public class ResultViewUtil {

    public static ResultView success(Object data) {
        ResultView resultView = new ResultView();
        resultView.setCoed(0);
        resultView.setMsg("success");
        resultView.setData(data);
        return resultView;
    }
}
