package homework.lesson3;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("a: ");
        int a = in.nextInt();
        System.out.println("b: ");
        int b = in.nextInt();
        System.out.println("c: ");
        int c = in.nextInt();

        double result = java.lang.Math.abs(a - b) / java.lang.Math.pow((a + b), 3) - java.lang.Math.sqrt(c);
        System.out.println(result);

    }


}
