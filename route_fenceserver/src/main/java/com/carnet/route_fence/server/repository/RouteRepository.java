package com.carnet.route_fence.server.repository;

import com.carnet.route_fence.server.data.Route;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RouteRepository extends JpaRepository<Route, Integer> {
}
