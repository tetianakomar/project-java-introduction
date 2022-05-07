package homework.lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fuel {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the distance: ");
        int distance = Integer.parseInt(reader.readLine());
        System.out.println("Input the amount of fuel: ");
        int amountOfFuel = Integer.parseInt(reader.readLine());
        int fuelPer100 = 100;
        System.out.println("Fuel consumption per 100 km: " + calculateFuelConsumption(1,2,3));

    }

    public static double calculateFuelConsumption(int amountOfFuel, int distance, int fuelPer100) {
        return (double) amountOfFuel / distance * fuelPer100;

    }
}
