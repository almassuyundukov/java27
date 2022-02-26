package lesson7;

public class Main {
    public static void main(String[] args) {
        int count = DZ7.countChetInMassiv(new int[]{23,46,25,78,10});
        System.out.println(count);
        boolean passwordAccuracy = DZ7.checkPassword("Alma2uol");
        System.out.println(passwordAccuracy);
        boolean emailValidity = DZ7.emailValidity("asdqwwq@.s");
        System.out.println(emailValidity);
    }
}
