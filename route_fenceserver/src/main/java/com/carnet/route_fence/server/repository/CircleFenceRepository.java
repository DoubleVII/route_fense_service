package com.carnet.route_fence.server.repository;

import com.carnet.route_fence.server.data.CircleFence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CircleFenceRepository extends JpaRepository<CircleFence, Integer> {
}
