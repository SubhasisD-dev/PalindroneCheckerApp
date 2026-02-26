import java.util.Stack;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "radar";
        Stack<Character> stack = new Stack<>();
        String reversed = "";

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        while (!stack.isEmpty()) {
            reversed = reversed + stack.pop();
        }

        if (input.equals(reversed)) {
            System.out.println("The string \"" + input + "\" is a PALINDROME.");
        } else {
            System.out.println("The string \"" + input + "\" is NOT a palindrome.");
        }
    }
}