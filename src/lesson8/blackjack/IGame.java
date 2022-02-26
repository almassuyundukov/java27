package lesson8.blackjack;

import lesson8.blackjack.Player;

public interface IGame {
    void addPlayer(Player player);

    void dealTwoCards();

    void dealMaxCards();

    void printWinner();
}
