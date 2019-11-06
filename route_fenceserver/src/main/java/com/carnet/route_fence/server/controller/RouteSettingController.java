package com.carnet.route_fence.server.controller;

import com.carnet.route_fence.server.conventer.RouteSettingForm2RouteSettingConverter;
import com.carnet.route_fence.server.form.RouteSettingCreateForm;
import com.carnet.route_fence.server.service.RouteSettingService;
import com.carnet.route_fence.server.utils.ResultViewUtil;
import com.carnet.route_fence.server.view.ResultView;
import com.carnet.route_fence.transfer.RouteSettingOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/route/setting")
public class RouteSettingController {

    @Autowired
    private RouteSettingService routeSettingService;


    @PostMapping("/")
    public ResultView<List<RouteSettingOutput>> create(@Valid RouteSettingCreateForm routeSettingCreateForm, BindingResult bindingResult) {
        RouteSettingForm2RouteSettingConverter.convertCreateForm(routeSettingCreateForm);
        routeSettingService.setRoutes(null);
        ResultViewUtil.success(null);
        return null;
    }

    @DeleteMapping("/")
    public ResultView delete(@RequestParam("routeSettingId") Integer routeSettingId
            , @RequestParam("routeId") Integer fenceId
            , @RequestParam("carId") Integer carId) {
        routeSettingService.cancelRoute(null);
        return null;
    }
}
