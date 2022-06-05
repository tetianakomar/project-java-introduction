package homework.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Input number: ");
        int number = Integer.parseInt(READER.readLine());
        System.out.println(calculateFactorial(number));
    }

    public static int calculateFactorial(int number) {
        if (number > 1) {
            return number * calculateFactorial(number - 1);
        }
        return 1;
    }
}
