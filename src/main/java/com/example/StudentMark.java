package com.example;

import java.util.ArrayList;
import java.util.List;

public class StudentAttendance {

    private String name;
    private List<Boolean> attendanceRecords;

    public StudentAttendance(String name) {
        this.name = name;
        this.attendanceRecords = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAttendanceRecord(boolean present) {
        attendanceRecords.add(present);
    }

    public int getAttendancePercentage() {
        if (attendanceRecords.isEmpty()) return 0;

        int presentDays = 0;
        for (boolean record : attendanceRecords) {
            if (record) {
                presentDays++;
            }
        }

        return (presentDays * 100) / attendanceRecords.size();
    }

    public boolean isEligibleForExam() {
        return getAttendancePercentage() >= 75;
    }

    public String getWarningSignal() {
        int percentage = getAttendancePercentage();
        if (percentage < 50) return "Critical Warning !!";
        if (percentage < 75) return "Low Attendance !!";
        return "Good Attendance, Well Done";
    }
}
