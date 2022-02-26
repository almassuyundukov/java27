package lesson3;

public class Main5 {
    public static void main(String[] args) {
        // сдвинуть каждую ячейку на одну позицию вправо
        char[] a = {'q', 'w', 'e', 'r', 't', 'y'};
        char[] b = new char[a.length];
//        b[0] = a[1];
//        b[1] = a[2];
//        b[2] = a[3];
//        b[3] = a[4];
//        b[4] = a[5];
//        b[5] = a[0];
        for (int i = 0; i < b.length; i++) {
            if (i == a.length-1) {
                b[a.length-1] = a[0];
            } else {
                b[i] = a[i + 1];
            }
            System.out.println(b[i]);
        }

    }
}
