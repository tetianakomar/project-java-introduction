package classwork.lesson4;

public class Methods {

    public static void main(String[] args) {
        printMessage();

        int number = generateRandom ();
        System.out.println(number);

        int randomInt = generateRandom(18, 50);
        System.out.println(randomInt);

        printMessage("test");

       // Methods methods = new Methods();
        //methods.printMessage();


    }

    public static void printMessage() {
        System.out.println("message");

    }

    public static void printMessage(String message) {

    }

    public static int generateRandom() {
        return (int) (Math.random() * 100);

    }
    public static int generateRandom (int min, int max) {

        return (int) (Math.random()* (max - min) +min);
    }


}
