package com.trippligo.planner.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class PlannerRequestDTO {

    @NotBlank(message = "Starting city is required")
    private String fromCity;

    @NotNull(message = "Number of days is required")
    private Integer days;

    @NotNull(message = "Budget is required")
    private Integer budget;

    @NotBlank(message = "Traveler type is required")
    private String travelers;

    @Size(min = 1, message = "At least one interest must be selected")
    private List<String> interests;

    public PlannerRequestDTO() {}

    public String getFromCity() {
        return fromCity;
    }

    public void setFromCity(String fromCity) {
        this.fromCity = fromCity;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public String getTravelers() {
        return travelers;
    }

    public void setTravelers(String travelers) {
        this.travelers = travelers;
    }

    public List<String> getInterests() {
        return interests;
    }

    public void setInterests(List<String> interests) {
        this.interests = interests;
    }
}
