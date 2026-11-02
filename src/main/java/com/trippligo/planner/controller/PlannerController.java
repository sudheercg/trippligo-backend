package com.trippligo.planner.controller;

import com.trippligo.planner.dto.PlannerRequestDTO;
import com.trippligo.planner.dto.PlannerResponseDTO;
import com.trippligo.planner.service.PlannerService;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/planner")
@CrossOrigin(origins = "*") // adjust later for security
public class PlannerController {

    private final PlannerService plannerService;

    public PlannerController(PlannerService plannerService) {
        this.plannerService = plannerService;
    }

    @PostMapping("/plan")
    public ResponseEntity<PlannerResponseDTO> planTrip(
            @Valid @RequestBody PlannerRequestDTO request) {
        PlannerResponseDTO response = plannerService.planTrip(request);
        return ResponseEntity.ok(response);
    }
}
