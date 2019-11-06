package com.carnet.route_fence.server.service;

import com.carnet.route_fence.server.view.RouteView;

import java.util.List;

public interface RouteService {

    RouteView create(RouteView routeView);

    void deleteByRouteId(Integer routeId);

    RouteView update(RouteView routeView);

    RouteView findByRouteId(Integer routeId);

    List<RouteView> findByCompanyId(Integer companyId);
}
