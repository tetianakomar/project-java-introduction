package classwork.lesson4;

import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("a: ");
        double a = in.nextInt();
        System.out.println("b: ");
        double b = in.nextInt();
        System.out.println("c: ");
        double c = in.nextInt();

        System.out.println("month: ");
        double month = in.nextInt();
        System.out.println("years: ");
        double years = in.nextInt();


        double timePeriod = years * month;

        System.out.println("1st salary for 10 years: " + (a * timePeriod));
        double sal1 = a * timePeriod;
        System.out.println("2nd salary for 10 years: " + (b * timePeriod));
        double sal2 = b * timePeriod;
        System.out.println("3rd salary for 10 years: " + (c * timePeriod));
        double sal3 = c * timePeriod;

        System.out.println("1st 5% for 10 years: " + (sal1 * 5 / 100));
        double tax1 = sal1 * 5 / 100;
        System.out.println("2nd 5% for 10 years: " + (sal2 * 5 / 100));
        double tax2 = sal2 * 5 / 100;
        System.out.println("3rd 5% for 10 years: " + (sal3 * 5 / 100));
        double tax3 = sal3 * 5 / 100;

        System.out.println("1st salary with tax: " + (sal1 - tax1));
        double sal1Tax = sal1 - tax1;
        System.out.println("2nd salary with tax: " + (sal2 - tax2));
        double sal2Tax = sal2 - tax2;
        System.out.println("3rd salary with tax: " + (sal3 - tax3));
        double sal3Tax = sal3 - tax3;

        System.out.println("average salary: " + ( sal1Tax + sal2Tax + sal3Tax)/3);
    }
}
