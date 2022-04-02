package TestsKataCards;

import KataCards.Card;
import KataCards.Player;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


/*
  ****CARD FUNCIONALITIES****

  # value of cards follows a ranking : 1,2,3,4,5,6,7,8,9,J,Q,K
  # According to ranking, when two cards face to each other, the winner one is the best
    in the ranking

  ****PLAYER FUNCIONALITIES****

  # Players will have two card to play
  # Players cannot change the order of cards in order to show them
  # players win when, after cards were used, has the highest score

 */


class PlayerShould {

    @Test
    void pass_happy_test(){
        assertEquals(1,1);
    }

    @Test
    void has_two_cards(){

        var somePlayer = new Player();

        somePlayer.takes(new Card());
        somePlayer.takes(new Card());

        assertEquals(2, somePlayer.cards.size());
    }
}
