package classwork.lesson4;

import java.util.Scanner;

public class Box {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("width: ");
        int width = in.nextInt();
        System.out.println("height: ");
        int heigth = in.nextInt();

        System.out.println("depth: ");
        int depth = in.nextInt();

        int volume = calculateVolume(width, heigth, depth);
        System.out.println(volume);

        System.out.println(calculateVolume(555, 666, 22));

    }

    public static int calculateVolume(int width, int height, int depth) {

        return width * height * depth;

    }
}
