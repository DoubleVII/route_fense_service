package com.carnet.route_fence.server.view;

import com.carnet.route_fence.server.data.RoutePoint;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RouteView {

    private Integer routeId;

    private Integer companyId;

    private Date createDate;

    private Date updateDate;

    private List<RoutePoint> routePointList;
}
