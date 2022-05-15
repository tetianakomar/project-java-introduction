package homework.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apples {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number of apples: ");
        int numberOfApples = Integer.parseInt(reader.readLine());
        int bigJar = 5;
        int middleJar = 3;
        int smallJar = 1;
        System.out.println("Big jars: " + calculateBigJar(numberOfApples, bigJar));
        System.out.println("Middle jars: " + calculateMiddleJar(numberOfApples, middleJar, bigJar));
        System.out.println("Small jars: " + calculateSmallJar(numberOfApples, smallJar, middleJar, bigJar));
    }

    public static int calculateBigJar(int numberOfApples, int bigJar) {
        return numberOfApples / bigJar;
    }

    public static int calculateMiddleJar(int numberOfApples, int middleJar, int bigJar) {
        return numberOfApples % bigJar / middleJar;
    }

    public static int calculateSmallJar(int numberOfApples, int smallJar, int middleJar, int bigJar) {
        return (numberOfApples - calculateBigJar(numberOfApples, bigJar) * bigJar -
                calculateMiddleJar(numberOfApples, middleJar, bigJar) * middleJar) / smallJar;
    }
}
