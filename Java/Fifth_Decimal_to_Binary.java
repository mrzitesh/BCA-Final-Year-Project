/*
Q5. Write a Java program to convert a Decimal Number to Binary Number.
*/

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();
        StringBuilder binaryNumber = new StringBuilder();

        // Convert decimal to binary
        while (decimalNumber > 0) {
            int remainder = decimalNumber % 2; // Get remainder
            binaryNumber.insert(0, remainder); // Append remainder to the front
            decimalNumber /= 2; // Divide the number by 2
        }

        // Output result
        System.out.println("Binary representation: " + binaryNumber);

        scanner.close();
    }
} 


//Output
/*
Enter a decimal number: 10
Binary representation: 1010

Enter a decimal number: 25
Binary representation: 11001
*/
