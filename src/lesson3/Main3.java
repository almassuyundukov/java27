package lesson3;

public class Main3 {
    public static void main(String[] args) {
        char[] symbols = {'a', 'v', 's', 'r', 'e', 'q', 'y', 'w'};
        for (int i = 0; i < symbols.length; i++) {
            if (symbols[i] == 'a' || symbols[i] == 'o' || symbols[i] == 'e' || symbols[i] == 'y'
                    || symbols[i] == 'u' || symbols[i] == 'i') {
                System.out.println(symbols[i]);
            }
        }
    }
}
