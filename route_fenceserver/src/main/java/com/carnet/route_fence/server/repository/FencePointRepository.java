package com.carnet.route_fence.server.repository;

import com.carnet.route_fence.server.data.FencePoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FencePointRepository extends JpaRepository<FencePoint, Integer> {
}
