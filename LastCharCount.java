import java.util.Scanner;

public class LastCharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Check if the string is not empty
        if (input.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            // Get the last character
            char lastChar = input.charAt(input.length() - 1);

            // Initialize the counter
            int count = 0;

            // Iterate through the entire string and count occurrences of the last character
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) == lastChar) {
                    count++;
                }
            }

            System.out.println("The last character appears " + count + " times in the given string.");
        }
    }
}