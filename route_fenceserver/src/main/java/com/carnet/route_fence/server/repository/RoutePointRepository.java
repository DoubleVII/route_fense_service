package com.carnet.route_fence.server.repository;

import com.carnet.route_fence.server.data.RoutePoint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoutePointRepository extends JpaRepository<RoutePoint, Integer> {
}
