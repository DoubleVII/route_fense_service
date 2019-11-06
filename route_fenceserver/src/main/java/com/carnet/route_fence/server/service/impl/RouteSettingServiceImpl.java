package com.carnet.route_fence.server.service.impl;

import com.carnet.route_fence.server.data.RouteSetting;
import com.carnet.route_fence.server.repository.RouteSettingRepository;
import com.carnet.route_fence.server.service.RouteSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteSettingServiceImpl implements RouteSettingService {

    @Autowired
    private RouteSettingRepository routeSettingRepository;


    //TODO use other service to send the set or cancel command to cars

    @Override
    public List<RouteSetting> setRoutes(List<RouteSetting> routeSettingList) {
        return null;
    }

    @Override
    public void cancelRoute(RouteSetting routeSetting) {

    }
}
