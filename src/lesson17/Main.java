package lesson17;

public class Main {
    public static void main(String[] args) {
        CopyWithOneByte copyWithOneByte = new CopyWithOneByte();
        CopyWithNio copyWithNio = new CopyWithNio();
        CopyWithApache copyWithApache = new CopyWithApache();
        CopyWithGuava copyWithGuava = new CopyWithGuava();

        long start1 = System.currentTimeMillis();
        copyWithOneByte.copy("C:\\Users\\sujun\\Downloads\\ideaIU-2021.3.2.exe", "1.exe");
        long end1 = System.currentTimeMillis();
        System.out.println("Копирование с помощью IO: " + (end1 - start1));

        long start2 = System.currentTimeMillis();
        copyWithNio.copy("C:\\Users\\sujun\\Downloads\\ideaIU-2021.3.2.exe", "2.exe");
        long end2 = System.currentTimeMillis();
        System.out.println("Копирование с помощью NIO: " + (end2 - start2));

        long start3 = System.currentTimeMillis();
        copyWithApache.copy("C:\\Users\\sujun\\Downloads\\ideaIU-2021.3.2.exe", "3.exe");
        long end3 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Apache: " + (end3 - start3));

        long start4 = System.currentTimeMillis();
        copyWithGuava.copy("C:\\Users\\sujun\\Downloads\\ideaIU-2021.3.2.exe", "4.exe");
        long end4 = System.currentTimeMillis();
        System.out.println("Копирование с помощью Guava: " + (end4 - start4));
    }
}
