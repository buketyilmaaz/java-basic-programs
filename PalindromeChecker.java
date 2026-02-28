import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or number: ");
        String text = input.nextLine();

        String reversed = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        if (text.equalsIgnoreCase(reversed)) {
            System.out.println("It is a palindrome.");
        } else {
            System.out.println("It is not a palindrome.");
        }

    }
}
