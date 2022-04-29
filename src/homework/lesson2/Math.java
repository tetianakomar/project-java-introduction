package homework.lesson2;

import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = scanner.nextInt();
        System.out.println("Input b: ");
        int b = scanner.nextInt();

//        int c = a;
//        a = b;
//        b = c;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
