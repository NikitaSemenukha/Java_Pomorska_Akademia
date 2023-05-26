import java.util.Scanner;

public class ReverseLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            // Create the reversed string
            String reversed = reverseString(input);

            System.out.println("Reversed string: " + reversed);
        }
    }

    // Reverses the given string
    private static String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}
