package homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baggage {


    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the height of your baggage: ");
        int height = Integer.parseInt(reader.readLine());
        System.out.println("Enter the width of your baggage: ");
        int width = Integer.parseInt(reader.readLine());
        System.out.println("Enter the length of your baggage: ");
        int length = Integer.parseInt(reader.readLine());

        boolean baggage = checkBaggageType(length, width, length);
        if (baggage) {
            System.out.println("It is carry-on baggage.");
        } else {
            System.out.println("It is not carry-on baggage.");
        }


    }

    public static boolean checkBaggageType(int height, int width, int length) {
        if (height <= 40 && width <= 20 && length <= 55 || height <= 53 && width <= 22 && length <= 40) {
            return true;
        }
        return false;
    }
}
