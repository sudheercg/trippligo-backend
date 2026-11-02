package com.trippligo.planner.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.trippligo.planner.dto.DestinationRecommendation;
import com.trippligo.planner.dto.DestinationRequest;
import com.trippligo.planner.dto.DestinationResponse;

@Service
public class DestinationIntelligenceService {

    public DestinationResponse recommend(DestinationRequest request) {

        List<DestinationRecommendation> recommendations = new ArrayList<>();

        String fromCity = request.fromCity() == null ? "" : request.fromCity().toLowerCase();
        List<String> interests = request.interests() == null ? List.of() :
                request.interests().stream().map(String::toLowerCase).toList();

        if (fromCity.contains("hyderabad") && request.days() <= 3 && request.budget() <= 15000) {

            if (interests.contains("beaches") || interests.contains("relaxation")) {
                recommendations.add(new DestinationRecommendation(
                        "Visakhapatnam",
                        88,
                        "Vizag is a practical short-trip beach destination from Hyderabad with good city comfort.",
                        List.of(
                                "Works well for 2–3 days",
                                "Train options are usually economical",
                                "Good balance of beaches, food, and sightseeing"
                        ),
                        "Comfortable",
                        "Medium",
                        "Avoid very hot summer afternoons; evenings are better for beach time."
                ));

                recommendations.add(new DestinationRecommendation(
                        "Gokarna",
                        82,
                        "Gokarna suits travelers who want calmer beaches and a slower experience.",
                        List.of(
                                "Good for budget beach trips",
                                "Less commercial than Goa",
                                "Works for relaxed travel rather than packed sightseeing"
                        ),
                        "Budget-friendly",
                        "High",
                        "Travel time from Hyderabad can be tiring for a very short trip."
                ));
            }

            if (interests.contains("food") || interests.contains("culture")) {
                recommendations.add(new DestinationRecommendation(
                        "Pondicherry",
                        78,
                        "Pondicherry is good for food, cafés, walking streets, and relaxed seaside evenings.",
                        List.of(
                                "Good for couples and friends",
                                "Strong food and café culture",
                                "Simple, walkable experience"
                        ),
                        "Moderate",
                        "High",
                        "For only 2 days, travel time may feel slightly heavy."
                ));
            }
        }

        if (interests.contains("nature") || interests.contains("hills")) {
            recommendations.add(new DestinationRecommendation(
                    "Coorg",
                    80,
                    "Coorg is suitable for greenery, quiet stays, coffee estates, and slow travel.",
                    List.of(
                            "Good for nature-focused travelers",
                            "Suitable for couples and families",
                            "Better when the goal is rest, not rushing"
                    ),
                    "Moderate",
                    "High",
                    "Road travel can be long; choose only if you are okay with slower movement."
            ));
        }

        if (recommendations.isEmpty()) {
            recommendations.add(new DestinationRecommendation(
                    "Flexible Planning Needed",
                    60,
                    "Your inputs need a more customized plan. Try increasing days or budget for better options.",
                    List.of(
                            "Budget and days may be restrictive",
                            "More interests can improve recommendations",
                            "Nearby destinations may work better"
                    ),
                    "Depends",
                    "Depends",
                    "This is an early version of Trippligo intelligence."
            ));
        }

        return new DestinationResponse(
                "Trip ideas from " + request.fromCity(),
                recommendations.stream().limit(3).toList(),
                "These suggestions are decision-support only. Please verify travel, stay, weather, and safety before booking."
        );
    }
}