import java.util.Scanner;

public class CreditWork {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a four-digit number: ");
        String input = scanner.nextLine();

        char additionalNum = findFirstMatch(input, new char[]{'2', '1', '0'});
        if (additionalNum != ' ') {
            input = removeCharacterAtIndex(input, input.indexOf(additionalNum));
        } else {
            System.out.println("Error incorrectly entered number");
            return;
        }

        char secondNum;
        char thirdNum;
        switch (additionalNum) {
            case '2':
                secondNum = findFirstMatch(input, new char[]{'3', '2', '1', '0'});
                thirdNum = findFirstMatch(input, new char[]{'5', '4', '3', '2', '1', '0'});
                break;
            case '1':
            case '0':
                secondNum = findMaxValueInString(input);
                thirdNum = findFirstMatch(input, new char[]{'5', '4', '3', '2', '1', '0'});
                break;
            default:
            System.out.println("Error incorrectly entered number");
                return;
        }

        if (secondNum != ' ' && thirdNum != ' ') {
            input = removeCharacterAtIndex(input, input.indexOf(secondNum));
            input = removeCharacterAtIndex(input, input.indexOf(thirdNum));

            System.out.println("Time: " + additionalNum + secondNum + ":" + thirdNum + input);
        } else {
            System.out.println("Error incorrectly entered number");
        }
    }

    private static char findFirstMatch(String str, char[] values) {
        for (char value : values) {
            int index = str.indexOf(value);
            if (index != -1) {
                return value;
            }
        }
        return ' ';
    }

    private static char findMaxValueInString(String str) {
        char max = '0';
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c) && c > max) {
                max = c;
            }
        }
        return max;
    }

    private static String removeCharacterAtIndex(String str, int index) {
        StringBuilder builder = new StringBuilder(str);
        builder.deleteCharAt(index);
        return builder.toString();
    }
}
