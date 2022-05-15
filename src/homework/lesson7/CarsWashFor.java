package homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarsWashFor {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many cars are in line?");
        int cars = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= cars; i++) {
            System.out.println("Cars number: " + i);
            soapTheCar();
            washTheCar();
            dryTheCar();
        }

    }

    public static void soapTheCar() {
        System.out.println("Car is soaped.");
    }

    public static void washTheCar() {
        System.out.println("Car is washed.");
    }

    public static void dryTheCar() {
        System.out.println("Car is dried.");
    }
}
