package com.trippligo.planner.dto;

import java.util.List;

public record DestinationResponse(
        String title,
        List<DestinationRecommendation> recommendations,
        String note
) {
}