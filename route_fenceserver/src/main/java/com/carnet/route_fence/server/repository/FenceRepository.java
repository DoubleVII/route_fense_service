package com.carnet.route_fence.server.repository;

import com.carnet.route_fence.server.data.Fence;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FenceRepository extends JpaRepository<Fence, Integer> {
}
