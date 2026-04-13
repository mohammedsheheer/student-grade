package com.analytics.system;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.*;

public class AppTest {

    @Test
    public void testTotalMarksAndGrade() {
        StudentMark mark = new StudentMark("Math", 25, 15, 45); // Total 85
        assertEquals(85.0, mark.getTotalMarks(), 0.01);
        assertEquals("A", mark.getGrade());
    }

    @Test
    public void testGPACalculation() {
        List<StudentMark> marks = Arrays.asList(
            new StudentMark("Java", 30, 20, 50),  // 100
            new StudentMark("Python", 20, 10, 30) // 60
        );
        // Average = 80, GPA = 8.0
        assertEquals(8.0, App.calculateGPA(marks), 0.01);
    }

    @Test
    public void testIdentifyTopper() {
        Map<String, List<StudentMark>> data = new HashMap<>();
        
        // Student 1 (GPA 9.0)
        data.put("Alice", Arrays.asList(new StudentMark("OS", 28, 18, 44))); 
        
        // Student 2 (GPA 7.0)
        data.put("Bob", Arrays.asList(new StudentMark("OS", 20, 10, 40)));
        
        // Student 3 (GPA 9.5) - Topper
        data.put("Charlie", Arrays.asList(new StudentMark("OS", 29, 19, 47)));

        assertEquals("Charlie", App.identifyTopper(data));
    }
}