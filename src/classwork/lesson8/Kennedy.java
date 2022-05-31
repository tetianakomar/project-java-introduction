package classwork.lesson8;

public class Kennedy {
    public static void main(String[] args) {
        int[] killers = {1, 2, 3, 4, 5, 66, 7, 8, 9, 10};
        int index = 1;
        int max = killers[index];

        for (int i = 1; i < killers.length; i++) {
            if (killers[i] > max) {
                max = killers[i];
                index = i;
            }
        }
        System.out.println(index + " killer: " + max);
    }

}



