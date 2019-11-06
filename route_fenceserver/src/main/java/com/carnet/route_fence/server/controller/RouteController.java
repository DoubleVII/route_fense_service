package com.carnet.route_fence.server.controller;

import com.carnet.route_fence.server.conventer.RouteForm2RouteViewConverter;
import com.carnet.route_fence.server.form.RouteCreateForm;
import com.carnet.route_fence.server.form.RouteUpdateForm;
import com.carnet.route_fence.server.service.RouteService;
import com.carnet.route_fence.server.utils.ResultViewUtil;
import com.carnet.route_fence.server.view.ResultView;
import com.carnet.route_fence.transfer.RouteOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/route")
public class RouteController {

    @Autowired
    private RouteService routeService;


    @PostMapping("/")
    public ResultView<RouteOutput> create(@Valid RouteCreateForm routeCreateForm, BindingResult bindingResult) {
        RouteForm2RouteViewConverter.convertCreateForm(routeCreateForm);
        routeService.create(null);
        ResultViewUtil.success(null);
        return null;
    }

    @DeleteMapping("/")
    public ResultView delete(@RequestParam Integer routeId) {
        routeService.deleteByRouteId(routeId);
        return null;
    }

    @PutMapping("/")
    public ResultView<RouteOutput> update(@Valid RouteUpdateForm routeUpdateForm, BindingResult bindingResult){
        RouteForm2RouteViewConverter.convertUpdateForm(routeUpdateForm);
        return null;
    }

    @GetMapping("/")
    public ResultView<List<RouteOutput>> find(@RequestParam("companyId") Integer companyId, @RequestParam("routeId") Integer routeId){
        return null;
    }

}
