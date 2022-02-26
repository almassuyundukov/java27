package homework2;

public class Main2 {
    public static void main(String[] args) {
        // вывести на консоль сумму четных чисел от 20 до 40
        int sumChetChisel = 0;
        for (int i = 20; i <= 40; i++) {
            if (i % 2 == 0) {
                sumChetChisel += i;
            }
        }
        System.out.println(sumChetChisel);
    }
}
