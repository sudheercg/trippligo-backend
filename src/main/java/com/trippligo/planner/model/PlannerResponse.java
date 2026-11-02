package com.trippligo.planner.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "planner_responses")
@Data
public class PlannerResponse {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private Long requestId;

  @Column(columnDefinition = "JSON")
  private String responseJson;

  private String summary;
  private String aiProvider;
  private Integer tokensUsed;
  private BigDecimal costInr;
  private Boolean cached = false;

  private LocalDateTime createdAt = LocalDateTime.now();
}
