package com.carnet.route_fence.server.repository;

import com.carnet.route_fence.server.data.RouteSetting;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface RouteSettingRepository extends JpaRepository<RouteSetting, CriteriaBuilder.In> {
}
