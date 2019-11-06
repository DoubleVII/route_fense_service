package com.carnet.route_fence.server.service.impl;

import com.carnet.route_fence.server.data.FenceSetting;
import com.carnet.route_fence.server.repository.FenceSettingRepository;
import com.carnet.route_fence.server.service.FenceSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FenceSettingServiceImpl implements FenceSettingService {

    @Autowired
    private FenceSettingRepository repository;

    //TODO use other service to send the set or cancel command to cars

    @Override
    public List<FenceSetting> setFences(List<FenceSetting> fenceSettingList) {
        return null;
    }

    @Override
    public void cancelFence(FenceSetting fenceSetting) {

    }
}
