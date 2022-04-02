package KataCards;

import java.util.ArrayList;

public class Player {

    public static int Turn = 1;

    public ArrayList<Card> cards = new ArrayList<Card>();
    private int score = 0;

    public void takes(Card card) {
        cards.add(card);
    }

    public String displayCardOfTurn(int turn) {
        return cards.get(turn-1).displayFigure();
    }

    public void duelWith(Player otherPlayer) {

    }

    public int getScore() {
        return this.score;
    }
}
