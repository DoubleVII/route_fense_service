package com.carnet.route_fence.server.service.impl;

import com.carnet.route_fence.server.repository.RoutePointRepository;
import com.carnet.route_fence.server.repository.RouteRepository;
import com.carnet.route_fence.server.repository.RouteSettingRepository;
import com.carnet.route_fence.server.service.RouteService;
import com.carnet.route_fence.server.view.RouteView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private RoutePointRepository routePointRepository;

    @Autowired
    private RouteSettingRepository routeSettingRepository;


    //TODO use other service to send the set or cancel command to cars

    @Override
    public RouteView create(RouteView routeView) {
        return null;
    }

    @Override
    public void deleteByRouteId(Integer routeId) {

    }

    @Override
    public RouteView update(RouteView routeView) {
        return null;
    }

    @Override
    public RouteView findByRouteId(Integer routeId) {
        return null;
    }

    @Override
    public List<RouteView> findByCompanyId(Integer companyId) {
        return null;
    }
}
