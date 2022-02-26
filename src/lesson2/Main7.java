package lesson2;

public class Main7 {
    public static void main(String[] args) {
        // цифры от 100 до 1000, кратные 3 и 5
        for (int i = 100; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}
