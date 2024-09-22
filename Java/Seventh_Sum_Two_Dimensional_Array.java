/*
Q7. Write a Java program to calculate Sum of two 2-dimensional arrays.
*/

import java.util.Scanner;

public class SumOf2DArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions of the arrays
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        // Initialize the arrays
        int[][] array1 = new int[rows][cols];
        int[][] array2 = new int[rows][cols];
        int[][] sumArray = new int[rows][cols];

        // Input elements for the first array
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }

        // Input elements for the second array
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }

        // Calculate the sum of the two arrays
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }

        // Display the sum array
        System.out.println("Sum of the two arrays:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
} 



//Output
/*
Enter number of rows: 2
Enter number of columns: 3
Enter elements for the first array:
1 2 3
4 5 6
Enter elements for the second array:
7 8 9
10 11 12
Sum of the two arrays:
8 10 12 
14 16 18
*/
