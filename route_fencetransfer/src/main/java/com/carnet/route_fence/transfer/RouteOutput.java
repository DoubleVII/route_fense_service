package com.carnet.route_fence.transfer;

import lombok.Data;

import java.util.List;

@Data
public class RouteOutput {
    private Integer routeId;

    private Integer companyId;

    private List<PointOutput> routePointList;

}
