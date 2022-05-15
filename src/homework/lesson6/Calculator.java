package homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the 1st number: ");
        int numberOne = Integer.parseInt(reader.readLine());
        System.out.println("Input operation: ");
        char operation = reader.readLine().charAt(0);
        System.out.println("Input the 2nd number: ");
        int numberTwo = Integer.parseInt(reader.readLine());
        if (operation == '/' && numberTwo == 0) {
            System.out.println("You can't divide to 0!");
            return;
        }
        double result = getResult(numberOne, operation, numberTwo);
        System.out.println("Result: " + result);
    }

    public static double getResult(int numberOne, char operation, int numberTwo) {
        double result = 0;
        switch (operation) {
            case '+' -> result = numberOne + numberTwo;
            case '-' -> result = numberOne - numberTwo;
            case '*' -> result = numberOne * numberTwo;
            case '/' -> result = numberOne / numberTwo;
            default -> System.out.println("Unknown operation!");
        }
        return result;
    }
}
