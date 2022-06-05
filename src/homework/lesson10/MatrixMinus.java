package homework.lesson10;

import java.util.Arrays;

public class MatrixMinus {
    public static void main(String[] args) {
        int[][] array = createAndFillMatrix(2, 3);
        System.out.println(Arrays.deepToString(array));
        printNegativeIndex(array);

    }

    public static int[][] createAndFillMatrix(int rows, int columns) {
        int[][] array = new int[rows][columns];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10 - 5);
            }
        }
        return array;
    }

    public static void printNegativeIndex(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] < 0) {
                    System.out.println("i = " + i + " j = " + j);
                }
            }
        }
    }
}
