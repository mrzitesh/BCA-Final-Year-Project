/*
Q9. Write a Java program to calculate the sum of the prime numbers in an array.
*/

import java.util.Scanner;

public class SumOfPrimeNumbers {
    
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // Number is prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        // Input elements for the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Calculate the sum of prime numbers
        int sum = 0;
        for (int num : array) {
            if (isPrime(num)) {
                sum += num; // Add prime number to the sum
            }
        }

        // Output result
        System.out.println("The sum of the prime numbers in the array is: " + sum);

        scanner.close();
    }
} 



//output
/*
Enter the number of elements in the array: 5
Enter the elements of the array:
10 3 5 8 11
The sum of the prime numbers in the array is: 19
*/
