package com.trippligo.planner.service;

import org.springframework.stereotype.Service;

import com.trippligo.planner.dto.ItineraryDayDTO;
import com.trippligo.planner.dto.PlannerRequestDTO;
import com.trippligo.planner.dto.PlannerResponseDTO;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PlannerService {

    public PlannerResponseDTO planTrip(PlannerRequestDTO request) {

        PlannerResponseDTO response = new PlannerResponseDTO();
        response.setCached(false);

        // -------- Summary --------
        response.setSummary(
                "A relaxed " + request.getDays() +
                "-day travel plan for a " +
                request.getTravelers().toLowerCase() +
                ", starting from " +
                request.getFromCity() + "."
        );

        // -------- Mock AI Logic (Replace with OpenAI later) --------

        List<ItineraryDayDTO> itinerary = List.of(
                new ItineraryDayDTO(
                        "Day 1",
                        "Travel from " + request.getFromCity() +
                        ", check in and explore nearby places. Enjoy local cuisine."
                ),
                new ItineraryDayDTO(
                        "Day 2",
                        "Focus on interests like " +
                        String.join(", ", request.getInterests()) +
                        ". Visit popular attractions and relax in the evening."
                ),
                new ItineraryDayDTO(
                        "Day 3",
                        "Leisure morning, local shopping within budget ₹" +
                        request.getBudget() +
                        ", and return journey."
                )
        );

        // -------- Sections --------
        Map<String, Object> sections = new HashMap<>();
        sections.put("itinerary", itinerary);

        response.setSections(sections);

        return response;
    }
}
