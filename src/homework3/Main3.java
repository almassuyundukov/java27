package homework3;

public class Main3 {
    public static void main(String[] args) {
        // напечатать сумму значений всех ячеек
        int[] numbers = {3, 5, 6, 7, -10, 9, -2};
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa += numbers[i];
        }
        System.out.println(summa);
    }
}
