package com.marvelousmacros.app.enums;

public enum ActivityLevel {
    NONE("Little to no exercise"),
    LIGHT("1-3 days a week of light exercise"),
    MODERATE("3-5 days a week of moderate exercise"),
    INTENSE("6-7 days a week of intense exercise"),
    EXTREME("7 days a week of intense exercise plus sports or physical job");

    private final String description;
    ActivityLevel(String description) {
        this.description = description;
    }

    String getDescription() {
        return description;
    }
}
