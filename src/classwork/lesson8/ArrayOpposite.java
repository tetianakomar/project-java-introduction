package classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static classwork.lesson8.Arrays.printArray;

public class ArrayOpposite {

    public static void main(String[] args) throws IOException {

        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input array size: ");
        int[] numbers = new int[Integer.parseInt(READER.readLine())];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("input " + i + " number: ");
            numbers[i] = Integer.parseInt(READER.readLine());
        }

        printArray(numbers);
        System.out.println(numbers);

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);

        }

    }
}
