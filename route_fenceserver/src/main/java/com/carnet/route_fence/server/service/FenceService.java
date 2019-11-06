package com.carnet.route_fence.server.service;

import com.carnet.route_fence.server.view.CircleFenceView;
import com.carnet.route_fence.server.view.FenceView;

import java.util.List;

public interface FenceService {

    FenceView create(FenceView fenceView);

    CircleFenceView createCircle(CircleFenceView circleFenceView);

    void deleteByFenceId(Integer fenceId);

    FenceView update(FenceView fenceView);

    CircleFenceView updateCircle(CircleFenceView circleFenceView);

    FenceView findByFenceId(Integer fenceId);

    List<FenceView> findByCompanyId(Integer companyId);
}
