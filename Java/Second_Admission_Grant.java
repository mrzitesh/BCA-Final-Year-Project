/*
Q2. Admission to a professional course is subject to the following conditions: 
 (a) marks in Mathematics >= 60 (b) marks in Physics >=50 (c) marks in Chemistry 
>=40 (d) Total in all 3 subjects >=200 (Or) Total in Maths & Physics>=150
*/

import java.util.Scanner;

public class AdmissionCriteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input marks for the subjects
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
            System.out.println("Admission Granted.");
        } else {
            System.out.println("Admission Denied.");
        }

        scanner.close();
    }
} 



// Output 
/*
Enter marks in Mathematics: 70
Enter marks in Physics: 55
Enter marks in Chemistry: 45
Admission Granted.

Enter marks in Mathematics: 50
Enter marks in Physics: 45
Enter marks in Chemistry: 30
Admission Denied.


Enter marks in Mathematics: 80
Enter marks in Physics: 75
Enter marks in Chemistry: 30
Admission Granted.

*/
