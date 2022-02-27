package lesson16;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        try {
            person.setAge(-12);
            System.out.println("Возраст установлен");
        } catch (UncurrentAgeException e){
            System.out.println("Неверный возраст");
        }
        System.out.println("Все ОК");
    }
}
