import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            // Remove spaces and convert to lowercase
            String processedInput = input.replaceAll(" ", "").toLowerCase();

            // Check if the string is a palindrome
            boolean isPalindrome = checkPalindrome(processedInput);

            if (isPalindrome) {
                System.out.println("The given string is a palindrome.");
            } else {
                System.out.println("The given string is not a palindrome.");
            }
        }
    }

    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
