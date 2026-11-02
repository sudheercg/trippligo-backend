package com.trippligo.planner.dto;

public class ItineraryDayDTO {

    private String day;
    private String plan;

    public ItineraryDayDTO() {}

    public ItineraryDayDTO(String day, String plan) {
        this.day = day;
        this.plan = plan;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }
}
