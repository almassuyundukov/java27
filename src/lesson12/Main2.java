package lesson12;

import java.util.HashSet;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>();
        coins.add(new Coin(2.5, "Золото", 1900,5));
        coins.add(new Coin(2.5, "Золото", 1900,5));
        coins.add(new Coin(2, "Серебро", 1960,10));
        coins.add(new Coin(5, "Золото", 1950,1));
        coins.add(new Coin(2.5, "Бронза", 1940,5));

        for(Coin coin: coins){
            System.out.println(coin);
        }

        TreeSet<Coin> sortByDiam = CoinSort.sortByDiametr(coins);
        for(Coin c: sortByDiam){
            System.out.println(c);
        }

        TreeSet<Coin> sortByDiamFromBiggest = CoinSort.sortByDiametrFromBiggest(coins);
        for(Coin c: sortByDiamFromBiggest){
            System.out.println(c);
        }
    }
}
