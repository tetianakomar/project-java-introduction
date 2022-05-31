package homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Palindrome2 {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        System.out.println("Input string: ");
        String message = READER.readLine().toLowerCase(Locale.ROOT).replaceAll(" ", "");
        String result = isPalindrome(message) ? "It is palindrome!" : "It is not palindrome.";
        System.out.println(result);
    }

    public static boolean isPalindrome(String message) {
        StringBuilder reverseMessage = new StringBuilder(message).reverse();
        return message.equals(reverseMessage.toString());
    }
}
