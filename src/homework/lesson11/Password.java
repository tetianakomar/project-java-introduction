package homework.lesson11;

public class Password {
    public static String CAPITAL_LETTERS = "ABCDEFGHIKLMNOPQRSTVXYZ";
    public static String SMALL_LETTERS = "abcdefghiklmnopqrstvxyz";
    public static String NUMBERS = "0123456789";
    public static String SYMBOL = "_";

    public static void main(String[] args) {
        System.out.println(createPassword(8));
    }

    public static String getSymbols(String symbols, int size) {
        StringBuilder elements = new StringBuilder();
        int index;
        for (int i = 0; i < size; i++) {
            index = (int) (Math.random() * symbols.length());
            elements.append(symbols.charAt(index));
        }
        return elements.toString();
    }

    public static String createPassword(int passwordSize) {
        StringBuilder password = new StringBuilder();
        String allSymbols = CAPITAL_LETTERS + SMALL_LETTERS + NUMBERS + SYMBOL;
        password.append(getSymbols(CAPITAL_LETTERS, 1))
                .append(getSymbols(SMALL_LETTERS, 1))
                .append(getSymbols(NUMBERS, 1))
                .append(getSymbols(SYMBOL, 1))
                .append(getSymbols(allSymbols, passwordSize - 4));
        return shufflePassword(password.toString());
    }
    public static String shufflePassword(String unmixedPassword){
        char[] password = unmixedPassword.toCharArray();
        char temp;
        int index;
        for (int i = 0; i < password.length; i++) {
            index = (int) (Math.random() * password.length);
            temp = password[i];
            password[i] = password[index];
            password[index] = temp;
        }
        return new String(password);
    }
}
