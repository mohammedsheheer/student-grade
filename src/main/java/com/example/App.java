package com.analytics.system;

import java.util.*;

public class App {
    
    public static double calculateGPA(List<StudentMark> marks) {
        if (marks == null || marks.isEmpty()) return 0.0;
        double totalSum = 0;
        for (StudentMark mark : marks) {
            totalSum += mark.getTotalMarks();
        }
        // Assuming GPA is Total Average / 10
        return (totalSum / marks.size()) / 10.0;
    }

    public static String identifyTopper(Map<String, List<StudentMark>> studentData) {
        String topper = "";
        double highestGPA = -1.0;

        for (Map.Entry<String, List<StudentMark>> entry : studentData.entrySet()) {
            double currentGPA = calculateGPA(entry.getValue());
            if (currentGPA > highestGPA) {
                highestGPA = currentGPA;
                topper = entry.getKey();
            }
        }
        return topper;
    }

    public static void main(String[] args) {
        // Sample implementation for 5 students could be added here for CLI interaction
        System.out.println("Student Performance Analytics System Initialized.");
    }
}