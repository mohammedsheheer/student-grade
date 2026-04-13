package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        StudentAttendance student = new StudentAttendance(name);

        System.out.print("Enter number of days: ");
        int numDays = scanner.nextInt();

        for (int i = 0; i < numDays; i++) {
            System.out.print("Day " + (i + 1) + " (1 = Present, 0 = Absent): ");
            int input = scanner.nextInt();
            student.addAttendanceRecord(input == 1);
        }

        System.out.println("\n--- Report ---");
        System.out.println("Student: " + student.getName());
        System.out.println("Attendance: " + student.getAttendancePercentage() + "%");
        System.out.println("Eligibility: " +
                (student.isEligibleForExam() ? "Eligible" : "Not Eligible"));
        System.out.println("Status: " + student.getWarningSignal());

        scanner.close();
    }
}
