package homework2;

public class Main3 {
    public static void main(String[] args) {
        // Вывести от 10 до 50, пропустив 20 -- 25
        for (int i = 10; i <= 50; i++) {
            if (i < 20 || i > 25) {
                System.out.println(i);
            }

        }
    }
}
