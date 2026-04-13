package com.analytics.system;

public class StudentMark {
    private String subjectName;
    private double cat;        // Max 30
    private double assignment; // Max 20
    private double fat;        // Max 50

    public StudentMark(String subjectName, double cat, double assignment, double fat) {
        this.subjectName = subjectName;
        this.cat = cat;
        this.assignment = assignment;
        this.fat = fat;
    }

    public double getTotalMarks() {
        return cat + assignment + fat;
    }

    public String getGrade() {
        double total = getTotalMarks();
        if (total >= 90) return "S";
        if (total >= 80) return "A";
        if (total >= 70) return "B";
        if (total >= 60) return "C";
        if (total >= 50) return "D";
        return "F";
    }

    // Getters
    public String getSubjectName() { return subjectName; }
}