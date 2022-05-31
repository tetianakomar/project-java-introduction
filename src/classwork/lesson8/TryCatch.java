package classwork.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryCatch {
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Integer integer = getNumber();
        System.out.println(integer);
        //code
        System.out.println("continue...");
    }

    private static Integer getNumber() {
        try {
            System.out.println("Input number:");
            String str = READER.readLine();
            return Integer.parseInt(str);
        } catch (Exception exception) {
            System.out.println("Error" + exception.getMessage());
            return getNumber();
        }
    }
}
