package homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Palindrome {

    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String args[]) throws IOException {
        System.out.println("Input string: ");
        String message = READER.readLine().toLowerCase(Locale.ROOT).replaceAll(" ", "");
        System.out.println(isPalindrome(message));

    }

    public static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;

    }
}
