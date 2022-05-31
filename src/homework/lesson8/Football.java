package homework.lesson8;

public class Football {
    public static void main(String[] args) {
        int min = 18;
        int max = 45;
        int size = 11;
        int[] firstTeam = createAndFillArray(size, max, min);
        int[] secondTeam = createAndFillArray(size, max, min);
        double averageAge1 = calculateAverageAge(firstTeam);
        System.out.println("First team average age: " + averageAge1);
        double averageAge2 = calculateAverageAge(secondTeam);
        System.out.println("Second team average age: " + averageAge2);
        compareAverageAge(averageAge1, averageAge2);
    }

    public static int[] createAndFillArray(int size, int max, int min) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (max - min) + min);
        }
        return array;
    }

    public static double calculateAverageAge(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (double) sum / array.length;

    }

    public static void compareAverageAge(double averageAge1, double averageAge2) {
        if (averageAge1 > averageAge2) {
            System.out.println("The first average team age is higher.");
        } else if (averageAge2 > averageAge1) {
            System.out.println("The second average team age is higher.");
        } else {
            System.out.println("The average age of both teams is the same.");
        }
    }

}
