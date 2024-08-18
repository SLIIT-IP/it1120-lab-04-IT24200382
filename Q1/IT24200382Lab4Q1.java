import java.util.Scanner;

public class IT24200382Lab4Q1 {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 3: Determine if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is: Positive");
        } else if (number < 0) {
            System.out.println("The number is: Negative");
        } else {
            System.out.println("The number is Zero");
        }

        // Step 4: Close the scanner
        scanner.close();
    }
}
