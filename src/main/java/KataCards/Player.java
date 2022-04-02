package KataCards;

import java.util.ArrayList;

public class Player {

    public ArrayList<Card> cards = new ArrayList<Card>();

    public void takes(Card card) {
        cards.add(card);
    }

    public String displayCardOfTurn(int turn) {
        return cards.get(turn-1).displayFigure();
    }

    public void duelWith(Player otherPlayer, int i) {
    }
}
