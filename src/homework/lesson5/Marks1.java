package homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marks1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a mark for Pathology: ");
        int pathology = Integer.parseInt(reader.readLine());
        System.out.println("Enter a mark for Pharmacology: ");
        int pharmacology = Integer.parseInt(reader.readLine());
        System.out.println("Enter a mark for Physiology: ");
        int physiology = Integer.parseInt(reader.readLine());
        System.out.println("Enter a mark for Therapy: ");
        int therapy = Integer.parseInt(reader.readLine());
        System.out.println("Enter a mark for Surgery: ");
        int surgery = Integer.parseInt(reader.readLine());

        int gpa = calculateGpa(pathology, physiology, pharmacology, therapy, surgery);
        System.out.println("Grade Point Average: " + gpa);

        checkScolarship(gpa);

    }

    public static boolean isMarkValid(int pathology, int physiology, int pharmacology, int therapy, int surgery) {
        if (pathology > 0 && pathology < 12 && physiology > 0
                && physiology < 12 && pharmacology > 0 && pharmacology < 12 && therapy > 0
                && therapy < 12 && surgery > 0 && surgery < 12) {
            return false;
        } else {
            return true;
        }
    }

    public static int calculateGpa(int pathology, int physiology, int pharmacology, int therapy, int surgery) {
        int amountOfSubjects = 5;
        return (pathology + physiology + pharmacology + therapy + surgery) / amountOfSubjects;
    }

    public static void checkScolarship(int calculateGpa) {

        if (calculateGpa >= 10 && calculateGpa <= 12) {
            System.out.println("Higher scholarship");
        } else if (calculateGpa > 13) {
            System.out.println("Mark is not found");
        } else if (calculateGpa >= 8 && calculateGpa < 10) {
            System.out.println("Regular scholarship");
        } else {
            System.out.println("Without scholarship");
        }
    }
}




