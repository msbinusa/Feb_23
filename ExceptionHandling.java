
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input Validation
        int numberOfElements = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the number of elements: ");
                numberOfElements = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter integers only.");
                scanner.nextLine(); // Clear the buffer
            }
        }

        // Array Processing
        int[] array = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            try {
                System.out.print("Enter element " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter integers only.");
                scanner.nextLine(); // Clear the buffer
                i--; // Retry input for the same index
            }
        }

        // Array Sum Calculation
        int sum = 0;
        for (int value : array) {
            sum += value;
        }

        // Display the result
        System.out.println("Array processed successfully.");
        System.out.println("Sum of elements: " + sum);

        scanner.close();
    }
}