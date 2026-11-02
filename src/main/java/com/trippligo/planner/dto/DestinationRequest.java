package com.trippligo.planner.dto;

import java.util.List;

public record DestinationRequest(
        String fromCity,
        int days,
        int budget,
        String travelers,
        List<String> interests
) {
}