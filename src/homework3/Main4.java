package homework3;

public class Main4 {
    public static void main(String[] args) {
        // напечатать кого в массиве больше, четных или нечетных
        int[] numbers = {2, 5, 8, 9, 11, 64, 35, 97, 124, 64, 43};
        int countChetnih = 0;
        int countNeChetnih = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                countChetnih++;
            } else {
                countNeChetnih++;
            }
        }
        if (countChetnih > countNeChetnih) {
            System.out.println("Четных больше");
        } else if (countChetnih < countNeChetnih) {
            System.out.println("Нечетных больше");
        } else {
            System.out.println("Четные равны нечетным");
        }
    }
}
