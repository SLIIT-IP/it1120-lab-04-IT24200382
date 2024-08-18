import java.util.Scanner;

public class IT24200382Lab4Q3 {
    public static void main(String[] args) {
        // Step 1: Create a Scanner object to read input from the keyboard
        Scanner scanner = new Scanner(System.in);

        // Step 2: Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Step 3: Use the ternary operator to determine if the number is positive, negative, or zero
        String result = (number > 0) ? "The number is Positive." : 
                        (number < 0) ? "The number is Negative." : 
                        "The number is Zero.";

        // Step 4: Display the result
        System.out.println(result);

        // Step 5: Close the scanner
        scanner.close();
    }
}
