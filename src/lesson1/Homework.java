package lesson1;

public class Homework {
    public static void main(String[] args) {
        int capital = 1000;
        int pricePizza = 230;
        int priceBubbleGum = 26;
        double priceKonfeta = 2.5;
        int ostatokPoslePizza = capital % pricePizza;
        int amountPizza = capital / pricePizza;
        int ostatokPosleBubbleGum = ostatokPoslePizza % priceBubbleGum;
        int amountBubbleGum = ostatokPoslePizza / priceBubbleGum;
        int ostatokPosleKonfet = (int) (ostatokPosleBubbleGum % priceKonfeta);
        int amountKonfet = (int) (ostatokPosleBubbleGum / priceKonfeta);
        System.out.println("На эти деньги мы можем купить:");
        System.out.println("-" + amountPizza + " пиццы");
        System.out.println("-" + amountBubbleGum + " жвачки");
        System.out.println("-" + amountKonfet + " конфет");
        System.out.println("Сдача с магазина: " + ostatokPosleKonfet + " рубля");
    }
}
