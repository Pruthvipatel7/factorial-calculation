import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of terms
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        // Initialize the first two Fibonacci numbers
        long first = 0, second = 1;

        // Print the Fibonacci sequence
        System.out.println("Fibonacci Sequence up to " + terms + " terms:");

        // Loop through and calculate each Fibonacci number
        for (int i = 1; i <= terms; i++) {
            System.out.print(first + " "); // Print the current Fibonacci number

            // Update the Fibonacci numbers
            long next = first + second;
            first = second;
            second = next;
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}