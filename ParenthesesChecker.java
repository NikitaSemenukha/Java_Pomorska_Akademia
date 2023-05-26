import java.util.Scanner;
import java.util.Stack;

public class ParenthesesChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an arithmetic expression:");
        String expression = scanner.nextLine();

        if (expression.isEmpty()) {
            System.out.println("The string is empty.");
        } else {
            boolean hasOnlyDigits = checkExpression(expression);

            if (!hasOnlyDigits) {
                System.out.println("The expression contains letters or invalid characters.");
                return;
            }

            boolean isBalanced = checkParentheses(expression);

            if (isBalanced) {
                System.out.println("The parentheses in the expression are properly balanced.");
            } else {
                System.out.println("The parentheses in the expression are not properly balanced.");
            }
        }
    }

    // Check if parentheses in the expression are properly balanced
    private static boolean checkParentheses(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    // Check if the expression contains only digits and valid characters
    private static boolean checkExpression(String expression) {
        char[] validChars = {' ', '(', ')', '[', ']', '{', '}', '+', '-', '*', '/', '%', '^', '<', '>', '=', 'x', 'y', 'z'};

        for (char c : expression.toCharArray()) {
            if (!Character.isDigit(c) && !contains(validChars, c)) {
                return false;
            }
        }

        return true;
    }

    // Check if an array contains a specific character
    private static boolean contains(char[] arr, char target) {
        for (char c : arr) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}

