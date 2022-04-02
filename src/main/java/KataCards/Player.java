package KataCards;

import java.util.ArrayList;

public class Player {

    public ArrayList<Card> cards = new ArrayList<Card>();

    public void takes(Card card) {
        cards.add(card);
    }
}
