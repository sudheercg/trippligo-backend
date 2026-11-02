package com.trippligo.planner.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trippligo.planner.model.PlannerRequest;

public interface PlannerRequestRepository extends JpaRepository<PlannerRequest, Long> {
}
