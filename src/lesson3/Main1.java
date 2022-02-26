package lesson3;

public class Main1 {
    public static void main(String[] args) {
        int[] numbers = {2, 5, 6, 8, 1, 2, 4};
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }
}
