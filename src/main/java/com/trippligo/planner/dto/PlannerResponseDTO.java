package com.trippligo.planner.dto;

import java.util.Map;

public class PlannerResponseDTO {

    private boolean cached;
    private String summary;

    private Map<String, Object> sections;

    public boolean isCached() {
        return cached;
    }

    public void setCached(boolean cached) {
        this.cached = cached;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Map<String, Object> getSections() {
        return sections;
    }

    public void setSections(Map<String, Object> sections) {
        this.sections = sections;
    }
}
