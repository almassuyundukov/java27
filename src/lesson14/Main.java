package lesson14;

public class Main {
    public static void main(String[] args) {
        Holodilnik holodilnik = new Holodilnik();
        holodilnik.addProduct("Яблоко", 3);
        holodilnik.addProduct("Груша", 5);
        holodilnik.addProduct("Слива", 2);
        holodilnik.addProduct("Яблоко", 4);
        holodilnik.addProduct("Тесто", 4);

        holodilnik.getProduct("Яблоко", 4);
        holodilnik.printAllProduct();

        Receipt pirog = new Receipt();
        pirog.addIngridients("Яблоко", 2);
        pirog.addIngridients("Груша", 5);
        pirog.addIngridients("Тесто", 2);
        pirog.setName("Весенний пирог");
        System.out.println(holodilnik.canCook(pirog));;
    }
}
