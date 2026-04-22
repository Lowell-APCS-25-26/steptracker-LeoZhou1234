package org.APCSLowell;

public class StepTracker {
    int totalSteps, minSteps;
    int totalDays, activeDays;

    public StepTracker(int activityThreshold) {
        minSteps = activityThreshold;
        totalDays = 0;
        activeDays = 0;
        totalSteps = 0;
    }

    void addDailySteps(int stepCount) {
        totalSteps += stepCount;
        totalDays++;
        if (stepCount > minSteps) activeDays++;
    }
    int activeDays() {
        return activeDays;
    }
    double averageSteps() {
        if (totalSteps == 0) return 0;
        return (double) totalSteps / totalDays;
    }
}
