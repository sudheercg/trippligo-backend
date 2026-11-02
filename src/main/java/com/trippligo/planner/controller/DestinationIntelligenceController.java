package com.trippligo.planner.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trippligo.planner.dto.DestinationRequest;
import com.trippligo.planner.dto.DestinationResponse;
import com.trippligo.planner.service.DestinationIntelligenceService;

@RestController
@RequestMapping("/api/destination-intelligence")
@CrossOrigin(origins = "*")
public class DestinationIntelligenceController {

    private final DestinationIntelligenceService service;

    public DestinationIntelligenceController(DestinationIntelligenceService service) {
        this.service = service;
    }

    @PostMapping("/recommend")
    public DestinationResponse recommend(@RequestBody DestinationRequest request) {
        return service.recommend(request);
    }
}