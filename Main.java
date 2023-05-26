import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text:");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            // Calculate the sum of digits in the given text
            int digitSum = calculateDigitSum(input);

            System.out.println("Sum of digits in the given text: " + digitSum);
        }
    }

    // Calculates the sum of digits in the given text
    private static int calculateDigitSum(String text) {
        int sum = 0;

        // Iterate through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);

            // Check if the character is a digit
            if (Character.isDigit(c)) {
                // Convert the character to an integer and add it to the sum
                int digit = Character.getNumericValue(c);
                sum += digit;
            }
        }

        // Return the total sum of digits
        return sum;
    }
}
