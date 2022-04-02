package KataCards;

import java.util.ArrayList;

public class Player {

    public static int turn = 0;

    public ArrayList<Card> cards = new ArrayList<Card>();
    public int score = 0;

    public void takes(Card card) {
        cards.add(card);
    }

    public String displayCardOfTurn(int turn) {
        return cards.get(turn-1).displayFigure();
    }

    public void duelWith(Player otherPlayer) {

         ResultOfDuel duelResult = (this.cards.get(turn).faceTo(otherPlayer.cards.get(turn)));

        if(ResultOfDuel.WON == duelResult){
            this.score++;
        }else if(ResultOfDuel.LOST == duelResult){
            otherPlayer.score++;
        }

        turn++;
    }

}
