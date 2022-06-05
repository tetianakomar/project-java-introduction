package homework.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Zero {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int size = 10;
        int[] numbers = createAndFillArray(size);
        System.out.println(Arrays.toString(numbers));
        sortArray(numbers);
        System.out.println(Arrays.toString(numbers));

    }

    public static int[] createAndFillArray(int size) throws IOException {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Input number: " + i);
            array[i] = Integer.parseInt(READER.readLine());
        }
        return array;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[j] == 0) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    break;
                }
            }
        }
    }
}
