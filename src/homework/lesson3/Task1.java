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

        double result = Math.abs(a - b) / Math.pow((a + b), 3) - Math.sqrt(c);
        System.out.println(result);

    }


}
