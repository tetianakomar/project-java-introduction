package classwork.lesson9;

import java.util.Arrays;

public class ArrayShuffle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        shuffle(array);
        System.out.println(Arrays.toString(array));
    }


    public static void shuffle(int[] array) {
        int index;
        for (int i = 0; i < array.length; i++) {
            index = (int) (Math.random() * array.length);
            swap(array, index, i);

        }
    }

    private static void swap(int[] array, int index, int i) {
        int temp = array[i];
        array[i] = array[index];
        array[index] = temp;
    }
}
