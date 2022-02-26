package lesson8.blackjack;

public interface IPlayer {
    void addCardToHand(Card card);

    boolean needsCard();

    void openCards();

    int valuesHand();
}
