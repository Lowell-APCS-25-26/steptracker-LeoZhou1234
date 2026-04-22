package org.APCSLowell;

public class StepTracker {
    int totalSteps, minSteps;
    int totalDays, activeDays;

    public StepTracker(int activityThreshold) {
        minSteps = activityThreshold;
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
        return (double) totalSteps / totalDays;
    }
}
