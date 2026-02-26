import java.util.Scanner;

public class PalindroneCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println(" Welcome to Palindrome Checker System ");
        System.out.println("==========================================");

        System.out.print("Enter a word or sentence: ");
        String input = scanner.nextLine();

        boolean result = isPalindrome(input);

        if (result) {
            System.out.println("✅ The given input is a PALINDROME.");
        } else {
            System.out.println("❌ The given input is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String text) {

        // Remove spaces and convert to lowercase
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}