package com.trippligo.planner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.trippligo.planner.model.PlannerResponse;

public interface PlannerResponseRepository extends JpaRepository<PlannerResponse, Long> {

    @Query("""
      SELECT r FROM PlannerResponse r
      JOIN PlannerRequest q ON r.requestId = q.id
      WHERE q.inputHash = ?1
    """)
    PlannerResponse findByInputHash(String inputHash);
}
