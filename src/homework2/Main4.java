package homework2;

public class Main4 {
    public static void main(String[] args) {
        // Вывести среднее значение нечетных чисел от 0 до 100
        int n = 0;
        int summaNechetChisel = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                n++;
                summaNechetChisel += i;
            }
        }
        double sredZnachSummNechetChisel = summaNechetChisel / n;
        System.out.println(sredZnachSummNechetChisel);
    }
}
