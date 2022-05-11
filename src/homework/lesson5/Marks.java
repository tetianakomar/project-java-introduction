package homework.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Marks {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a mark for Pathology: ");
        int pathology = Integer.parseInt(reader.readLine());
        if (!isValid(pathology)) {
            return;
        }
        System.out.println("Enter a mark for Pharmacology: ");
        int physiology = Integer.parseInt(reader.readLine());
        if (!isValid(physiology)) {
            return;
        }
        System.out.println("Enter a mark for Physiology: ");
        int pharmacology = Integer.parseInt(reader.readLine());
        if (!isValid(pharmacology)) {
            return;
        }
        System.out.println("Enter a mark for Therapy: ");
        int therapy = Integer.parseInt(reader.readLine());
        if (!isValid(therapy)) {
            return;
        }
        System.out.println("Enter a mark for Surgery: ");
        int surgery = Integer.parseInt(reader.readLine());
        if (!isValid(surgery)) {
            return;
        }
        int amountOfSubjects = 5;

        int gpa = (pathology + physiology + pharmacology + therapy + surgery) / amountOfSubjects;
        System.out.println("GPA: " + gpa);


        if (gpa >= 10 && gpa <= 12) {
            System.out.println("Higher scholarship");
        } else if (gpa > 13) {
            System.out.println("Mark is not found");
        } else if (gpa > 8 && gpa < 10) {
            System.out.println("Regular scholarship");
        } else {
            System.out.println("Without scholarship");

        }
    }

    public static boolean isValid(int value) {

        if (value > 0 && value <= 12) {
            return true;
        }
        return false;
    }
}

