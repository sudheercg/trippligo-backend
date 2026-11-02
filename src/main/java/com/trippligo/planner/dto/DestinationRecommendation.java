package com.trippligo.planner.dto;

import java.util.List;

public record DestinationRecommendation(
        String destination,
        int fitScore,
        String summary,
        List<String> whyItFits,
        String budgetLevel,
        String travelEffort,
        String caution
) {
}