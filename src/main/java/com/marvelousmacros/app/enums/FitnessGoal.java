package com.marvelousmacros.app.enums;

public enum FitnessGoal {
    LOSE_FAT(.85),
    MAINTAIN(1),
    GAIN_MUSCLE(1.15);

    /**
     * Scales the users maintenance calories (TDEE) to meet their fitness goals.
     */
    private final double tdeeMultiplier;
    FitnessGoal(double tdeeMultiplier) {
        this.tdeeMultiplier = tdeeMultiplier;
    }

    double getTdeeMultiplier() {
        return tdeeMultiplier;
    }
}
