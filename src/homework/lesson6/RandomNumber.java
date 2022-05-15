package homework.lesson6;

public class RandomNumber {

    public static void main(String[] args) {

        System.out.println("Min number: " + getMinimum(getRandomNumber(), getRandomNumber(), getRandomNumber()));

    }

    public static int getRandomNumber() {
        return (int) (Math.random() * 100);
    }

    public static int getMinimum(int number1, int number2, int number3) {
        int minNumber = number1;
        if (number2 < minNumber) {
            minNumber = number2;
        }
        if (number3 < minNumber) {
            minNumber = number3;
        }
        return minNumber;
    }


}
