/*
Q2. Admission to a professional course is subject to the following conditions: 
 (a) marks in Mathematics >= 60 (b) marks in Physics >=50 
 (c) marks in Chemistry >=40    (d) Total in all 3 subjects >=200 (Or) Total in Maths & Physics>=150

Given the marks in the 3 subjects of n (user input) students, write a program to process the 
applications to list the eligible candidates.
*/

import java.util.Scanner;

public class AdmissionEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        String[] eligibleStudents = new String[n]; // Array to store eligible students
        int count = 0; // Counter for eligible students

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Enter marks in Mathematics: ");
            int mathMarks = scanner.nextInt();

            System.out.print("Enter marks in Physics: ");
            int physicsMarks = scanner.nextInt();

            System.out.print("Enter marks in Chemistry: ");
            int chemistryMarks = scanner.nextInt();

            // Calculate total marks
            int totalMarks = mathMarks + physicsMarks + chemistryMarks;

            // Check admission conditions
            boolean condition1 = mathMarks >= 60;
            boolean condition2 = physicsMarks >= 50;
            boolean condition3 = chemistryMarks >= 40;
            boolean condition4 = totalMarks >= 200;
            boolean condition5 = (mathMarks + physicsMarks) >= 150;

            // Determine admission eligibility
            if (condition1 && condition2 && condition3 && (condition4 || condition5)) {
                eligibleStudents[count] = "Student " + (i + 1);
                count++;
            }
        }

        // Output eligible candidates
        System.out.println("\nEligible candidates:");
        if (count == 0) {
            System.out.println("No students are eligible.");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.println(eligibleStudents[i]);
            }
        }

        scanner.close();
    }
}



// Output 
/*
Enter the number of students: 3

Student 1:
Enter marks in Mathematics: 70
Enter marks in Physics: 60
Enter marks in Chemistry: 50

Student 2:
Enter marks in Mathematics: 55
Enter marks in Physics: 45
Enter marks in Chemistry: 30

Student 3:
Enter marks in Mathematics: 65
Enter marks in Physics: 55
Enter marks in Chemistry: 40

Eligible candidates:
Student 1
Student 3
*/
