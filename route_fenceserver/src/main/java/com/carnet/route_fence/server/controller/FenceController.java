package com.carnet.route_fence.server.controller;

import com.carnet.route_fence.server.conventer.CircleFenceForm2CircleFenceConverter;
import com.carnet.route_fence.server.conventer.FenceForm2FenceViewConverter;
import com.carnet.route_fence.server.form.CircleFenceCreateForm;
import com.carnet.route_fence.server.form.CircleFenceUpdateForm;
import com.carnet.route_fence.server.form.FenceCreateForm;
import com.carnet.route_fence.server.form.FenceUpdateForm;
import com.carnet.route_fence.server.service.FenceService;
import com.carnet.route_fence.server.service.FenceSettingService;
import com.carnet.route_fence.server.utils.ResultViewUtil;
import com.carnet.route_fence.server.view.ResultView;
import com.carnet.route_fence.transfer.CircleFenceOutput;
import com.carnet.route_fence.transfer.FenceListOutput;
import com.carnet.route_fence.transfer.FenceOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/fence")
public class FenceController {

    @Autowired
    private FenceService fenceService;


    @PostMapping("/")
    public ResultView<FenceOutput> create(@Valid FenceCreateForm fenceCreateForm, BindingResult bindingResult) {
        FenceForm2FenceViewConverter.convertCreateForm(fenceCreateForm);
        fenceService.create(null);
        ResultViewUtil.success(null);
        return null;
    }

    @PostMapping("/circle")
    public ResultView<CircleFenceOutput> create(@Valid CircleFenceCreateForm circleFenceCreateForm, BindingResult bindingResult) {
        CircleFenceForm2CircleFenceConverter.convertCreateForm(circleFenceCreateForm);
        fenceService.createCircle(null);
        ResultViewUtil.success(null);
        return null;
    }

    @DeleteMapping("/")
    public ResultView delete(@RequestParam("fenceId") Integer fenceId) {
        fenceService.deleteByFenceId(fenceId);
        return null;
    }

    @PutMapping("/")
    public ResultView<FenceOutput> update(@Valid FenceUpdateForm fenceUpdateForm, BindingResult bindingResult){
        FenceForm2FenceViewConverter.convertUpdateForm(fenceUpdateForm);
        return null;
    }

    @PutMapping("/")
    public ResultView<CircleFenceOutput> updateCircle(@Valid CircleFenceUpdateForm circleFenceUpdateForm, BindingResult bindingResult){
        CircleFenceForm2CircleFenceConverter.convertUpdateForm(circleFenceUpdateForm);
        return null;
    }

    @GetMapping("/")
    public ResultView<FenceListOutput> find(@RequestParam("companyId") Integer companyId, @RequestParam("fenceId") Integer fenceId){
        return null;
    }

}
