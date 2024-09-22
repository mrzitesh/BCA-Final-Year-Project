// Q1. Write a java program to print the following pattern
 public class Patterns {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        // First pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Second pattern
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  "); // Printing spaces for indentation
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Third pattern (Hollow Box)
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print '*' for first and last row, and first and last column
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Printing spaces in the hollow part
                }
            }
            System.out.println();
        }
    }
}

// output 
/* 
First pattern:
* 
* * 
* * * 
* * * * 
* * * * * 

Second pattern:
* * * * * 
  * * * * 
    * * * 
      * * 
        * 

Third pattern:
* * * * * 
*       * 
*       * 
*       * 
* * * * *

*/
