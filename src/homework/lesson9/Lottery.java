package homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lottery {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int size = 7;
        int min = 0;
        int max = 9;
        int[] numbersFromPlayer = createAndFillArrayFromConsole(size, min, max);
        int[] numbersFromComputer = createAndFillArrayRandom(size, min, max);

        Arrays.sort(numbersFromPlayer);
        Arrays.sort(numbersFromComputer);

        System.out.println(Arrays.toString(numbersFromPlayer));
        System.out.println(Arrays.toString(numbersFromComputer));
        System.out.println("Number of matches: " + compareArrays(numbersFromComputer, numbersFromPlayer));

    }

    public static int[] createAndFillArrayFromConsole(int size, int min, int max) throws IOException {
        int[] array = new int[size];
        int temp;
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input number: ");
            temp = Integer.parseInt(READER.readLine());
            if (temp > max || temp < min) {
                System.out.println("Your number is invalid! Try again.");
                createAndFillArrayFromConsole(size, min, max);
            }
            array[i] = temp;
        }
        return array;
    }

    public static int[] createAndFillArrayRandom(int size, int min, int max) throws IOException {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input number: " + i);
            array[i] = (int) (Math.random() * (max - min) + min);
        }
        return array;
    }

    public static int compareArrays(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                count++;
            }
        }
        return count;
    }
}
