package com.carnet.route_fence.server.service;

import com.carnet.route_fence.server.data.FenceSetting;

import java.util.List;

public interface FenceSettingService {

    List<FenceSetting> setFences(List<FenceSetting> fenceSettingList);

    void cancelFence(FenceSetting fenceSetting);
}
