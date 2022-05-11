package classwork.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Truck {

    //public static int TRUCK_COUNT = 0;
    //public static final int TRUCK_MAX_WEIGHT = 58;

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input length of truck: ");
        int length = Integer.parseInt(reader.readLine());
        System.out.println("Input weight of truck: ");
        int weight = Integer.parseInt(reader.readLine());
        System.out.println("Input height of truck: ");
        int height = Integer.parseInt(reader.readLine());
        int volume = calculateVolume(length, weight, height);

        print(volume);
        int maxWeight = 58;
        int totalWeight = calculateTotalWeight(volume, maxWeight);
        print(totalWeight);

        System.out.println("Volume of truck: " + calculateVolume(length, weight, height) + " m3");
        System.out.println("Max weight for truck: " + calculateTotalWeight(volume, maxWeight) + " kg");

    }

    public static void print(int volume) {
        System.out.println(volume);
    }


    public static int calculateVolume(int length, int weight, int height) {
        int volume = length * weight * height;
        return volume;

    }

    public static int calculateTotalWeight(int volume, int maxWeight) {
        return volume * maxWeight;


    }
}
