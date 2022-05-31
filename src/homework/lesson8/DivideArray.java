package homework.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DivideArray {
    public static void main(String[] args) throws IOException {

        BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

        int size = 20;
        int[] numbers = createAndFillArray(size);
        int[] half1 = divideArray(numbers, 0);
        int[] half2 = divideArray(numbers, numbers.length / 2);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(half1));
        System.out.println(Arrays.toString(half2));
    }

    public static int[] createAndFillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }

    public static int[] divideArray(int[] bigArray, int startIndex) {
        int[] smallArray = new int[bigArray.length / 2];
        for (int i = 0; i < smallArray.length; i++) {
            smallArray[i] = bigArray[i + startIndex];
        }
        return smallArray;
    }

}


