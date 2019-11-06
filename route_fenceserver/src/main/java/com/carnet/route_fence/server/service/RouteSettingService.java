package com.carnet.route_fence.server.service;

import com.carnet.route_fence.server.data.FenceSetting;
import com.carnet.route_fence.server.data.RouteSetting;

import java.util.List;

public interface RouteSettingService {

    List<RouteSetting> setRoutes(List<RouteSetting> routeSettingList);

    void cancelRoute(RouteSetting routeSetting);
}
