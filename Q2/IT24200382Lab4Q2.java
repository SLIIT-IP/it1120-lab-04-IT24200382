import java.util.Scanner;

public class IT24200382Lab4Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input and validate exam marks
        System.out.print("Please enter exam marks (out of 100): ");
        double examMarks = scanner.nextDouble();
        if (examMarks < 0 || examMarks > 100) {
            System.out.println("Invalid exam marks! Please enter a value between 0 and 100.");
            return;
        }

        // Step 2: Input and validate lab submission marks
        System.out.print("Please enter lab submission marks (out of 100): ");
        double labMarks = scanner.nextDouble();
        if (labMarks < 0 || labMarks > 100) {
            System.out.println("Invalid lab marks! Please enter a value between 0 and 100.");
            return;
        }

        // Step 3: Input and validate exam percentage
        System.out.print("Please enter the percentage given for the exam: ");
        double examPercentage = scanner.nextDouble();

        // Step 4: Input and validate lab submission percentage
        System.out.print("Please enter the percentage given for the lab submission: ");
        double labPercentage = scanner.nextDouble();

        if (examPercentage + labPercentage != 100) {
            System.out.println("The percentages must add up to 100!");
            return;
        }

        // Step 5: Calculate the final mark
        double finalMark = (examMarks * examPercentage / 100) + (labMarks * labPercentage / 100);

        // Step 6: Display the final mark
        System.out.println("Final exam mark: " + finalMark);

        scanner.close();
    }
}
