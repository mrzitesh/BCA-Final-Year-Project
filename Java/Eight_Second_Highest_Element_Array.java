/*
Q8. Write a Java program to find second highest element of an array.
*/

import java.util.Scanner;

public class SecondHighestElement {
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

        // Variables to hold the highest and second highest values
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Find the highest and second highest elements
        for (int num : array) {
            if (num > highest) {
                secondHighest = highest; // Update second highest
                highest = num; // Update highest
            } else if (num > secondHighest && num < highest) {
                secondHighest = num; // Update second highest
            }
        }

        // Output result
        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("There is no second highest element in the array.");
        } else {
            System.out.println("The second highest element is: " + secondHighest);
        }

        scanner.close();
    }
} 



//Output
/*
Enter the number of elements in the array: 5
Enter the elements of the array:
10 20 4 45 99
The second highest element is: 45

Enter the number of elements in the array: 3
Enter the elements of the array:
5 5 5
There is no second highest element in the array.
*/
