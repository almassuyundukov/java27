package lesson2;

public class Main8 {
    public static void main(String[] args) {
        // от 20 до 50, пропустив интервал от 30 до 35
        for (int i = 20; i <= 50; i++) {
            if (i <= 30 || i >= 35) {
                System.out.println(i);
            }
        }
    }
}
