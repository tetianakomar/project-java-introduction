package homework.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CarWashWhile {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How many cars are in line?");
        int cars = Integer.parseInt(reader.readLine());
        int i = 1;
        while (i <= cars) {
            System.out.println("Cars number: " + i);
            soapTheCar();
            washTheCar();
            dryTheCar();
            i++;
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
