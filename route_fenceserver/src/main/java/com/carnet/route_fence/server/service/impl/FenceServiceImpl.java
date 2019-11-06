package com.carnet.route_fence.server.service.impl;

import com.carnet.route_fence.server.data.Fence;
import com.carnet.route_fence.server.data.FenceSetting;
import com.carnet.route_fence.server.repository.CircleFenceRepository;
import com.carnet.route_fence.server.repository.FencePointRepository;
import com.carnet.route_fence.server.repository.FenceRepository;
import com.carnet.route_fence.server.repository.FenceSettingRepository;
import com.carnet.route_fence.server.service.FenceService;
import com.carnet.route_fence.server.view.CircleFenceView;
import com.carnet.route_fence.server.view.FenceView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FenceServiceImpl implements FenceService {

    @Autowired
    private FenceRepository fenceRepository;

    @Autowired
    private FencePointRepository fencePointRepository;

    @Autowired
    private CircleFenceRepository circleFenceRepository;

    @Autowired
    private FenceSettingRepository fenceSettingRepository;


    //TODO use other service to send the set or cancel command to cars

    @Override
    public FenceView create(FenceView fenceView) {
        return null;
    }

    @Override
    public CircleFenceView createCircle(CircleFenceView circleFenceView) {
        return null;
    }

    @Override
    public void deleteByFenceId(Integer fenceId) {

    }

    @Override
    public FenceView update(FenceView fenceView) {
        return null;
    }

    @Override
    public CircleFenceView updateCircle(CircleFenceView circleFenceView) {
        return null;
    }

    @Override
    public FenceView findByFenceId(Integer fenceId) {
        return null;
    }

    @Override
    public List<FenceView> findByCompanyId(Integer companyId) {
        return null;
    }
}
