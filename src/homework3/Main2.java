package homework3;

public class Main2 {
    public static void main(String[] args) {
        // напечатать ячейки массива с конца в начало
        int[] numbers = {1, 63, 65, 57, 123, 98, 100, 0};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
