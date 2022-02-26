package lesson8.blackjack;

public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        Player player = new Player();
        Player player2 = new Player();
        Dealler dealler = new Dealler();
        game.addPlayer(player);
        game.addPlayer(player2);
        game.addPlayer(dealler);

        game.dealTwoCards();
        game.dealMaxCards();
        System.out.println();
        game.printWinner();
    }
}
