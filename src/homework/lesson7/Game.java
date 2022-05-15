package homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Game {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number: ");
        int number = Integer.parseInt(reader.readLine());
        int randomNumber = getRandomNumber();
        while (number != randomNumber) {
            System.out.println("Nit!-_-");
            System.out.println("Input number: ");
            number = Integer.parseInt(reader.readLine());
        }
        System.out.println("Congratulations! Your number is correct!");
    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}
