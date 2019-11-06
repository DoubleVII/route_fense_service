package com.carnet.route_fence.server.controller;


import com.carnet.route_fence.server.conventer.FenceForm2FenceViewConverter;
import com.carnet.route_fence.server.conventer.FenceSettingForm2FenceSettingConverter;
import com.carnet.route_fence.server.form.FenceSettingCreateForm;
import com.carnet.route_fence.server.service.FenceSettingService;
import com.carnet.route_fence.server.utils.ResultViewUtil;
import com.carnet.route_fence.server.view.ResultView;
import com.carnet.route_fence.transfer.FenceSettingOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/fence/setting")
public class FenceSettingController {


    @Autowired
    private FenceSettingService fenceSettingService;


    @PostMapping("/")
    public ResultView<List<FenceSettingOutput>> create(@Valid FenceSettingCreateForm fenceSettingCreateForm, BindingResult bindingResult) {
        FenceSettingForm2FenceSettingConverter.convertCreateForm(fenceSettingCreateForm);
        fenceSettingService.setFences(null);
        ResultViewUtil.success(null);
        return null;
    }

    @DeleteMapping("/")
    public ResultView delete(@RequestParam("fenceSettingId") Integer fenceSettingId
            , @RequestParam("fenceId") Integer fenceId
            , @RequestParam("carId") Integer carId) {
        fenceSettingService.cancelFence(null);
        return null;
    }

}
