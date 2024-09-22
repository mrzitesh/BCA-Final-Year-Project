/*
Q10. Write a Java program to find duplicate elements in a 1D array and find their frequency 
of occurrence.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateElements {
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

        // Use a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Output the duplicates and their frequency
        System.out.println("Duplicate elements and their frequency:");
        boolean hasDuplicates = false;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }

        scanner.close();
    }
} 


//output
/*
Enter the number of elements in the array: 7
Enter the elements of the array:
1 2 3 2 4 5 1
Duplicate elements and their frequency:
1: 2 times
2: 2 times
*/
