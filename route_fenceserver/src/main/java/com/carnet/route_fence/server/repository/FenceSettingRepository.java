package com.carnet.route_fence.server.repository;

import com.carnet.route_fence.server.data.FenceSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FenceSettingRepository extends JpaRepository<FenceSetting, Integer> {
}
