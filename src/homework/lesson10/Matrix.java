package homework.lesson10;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Matrix {
    public static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Input number of rows: ");
        int rows = Integer.parseInt(READER.readLine());
        System.out.println("Input number of columns: ");
        int columns = Integer.parseInt(READER.readLine());
        int[][] matrix = createAndFillMatrix(rows, columns);

        printMatrix(matrix);
        printMatrix(transplantMatrix(matrix));
    }

    public static int[][] createAndFillMatrix(int rows, int columns) throws IOException {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.parseInt(READER.readLine());
            }
        }
        return matrix;
    }

    public static int[][] transplantMatrix(int[][] matrix) {
        int[][] matrix2 = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                matrix2[i][j] = matrix[j][i];
            }
        }
        return matrix2;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] number : matrix) {
            for (int number2 : number) {
                System.out.print(number2);
            }
            System.out.println();
        }
    }
}
