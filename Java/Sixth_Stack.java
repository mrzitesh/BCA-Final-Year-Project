/*
Q6. Write a Java program to implement stack using array
*/

import java.util.Scanner;

class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    // Constructor to initialize the stack
    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1; // Stack is initially empty
    }

    // Method to add an item to the stack
    public void push(int item) {
        if (isFull()) {
            System.out.println("Stack overflow! Cannot push " + item);
            return;
        }
        stack[++top] = item;
        System.out.println(item + " pushed to stack.");
    }

    // Method to remove an item from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Cannot pop from empty stack.");
            return -1; // Indicate empty stack
        }
        return stack[top--];
    }

    // Method to peek at the top item of the stack
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1; // Indicate empty stack
        }
        return stack[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == capacity - 1;
    }

    // Method to display the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the stack: ");
        int size = scanner.nextInt();
        Stack stack = new Stack(size);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter an integer to push: ");
                    int item = scanner.nextInt();
                    stack.push(item);
                    break;
                case 2:
                    int poppedItem = stack.pop();
                    if (poppedItem != -1) {
                        System.out.println(poppedItem + " popped from stack.");
                    }
                    break;
                case 3:
                    int topItem = stack.peek();
                    if (topItem != -1) {
                        System.out.println("Top item is: " + topItem);
                    }
                    break;
                case 4:
                    stack.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
} 



//Output 
/*
Enter the size of the stack: 5

Choose an option:
1. Push
2. Pop
3. Peek
4. Display
5. Exit
1. Push
Enter an integer to push: 10
10 pushed to stack.

Choose an option:
1. Push
2. Pop
3. Peek
4. Display
5. Exit
4. Display
Stack: 10 

Choose an option:
1. Push
2. Pop
3. Peek
4. Display
5. Exit
2. Pop
10 popped from stack.
*/
