public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String word = "madam";
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println("The word \"" + word + "\" is a PALINDROME.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a palindrome.");
        }
    }
}