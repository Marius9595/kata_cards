package TestsKataCards;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


import KataCards.Card;
import KataCards.Player;


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

    private Player a_player;
    private Player otherPlayer;

    @BeforeEach
    void setUp(){
        a_player = new Player();
    }

    @Test
    void pass_happy_test(){
        assertEquals(1,1);
    }

    @Test
    void have_two_cards(){

        a_player.takes(new Card(1));
        a_player.takes(new Card(3));

        assertEquals(2, a_player.cards.size());
    }

    @Test
    void use_his_cards_in_the_same_order_as_they_were_given(){

        a_player.takes(new Card(1));
        a_player.takes(new Card(11));

        assertEquals("1", a_player.displayCardOfTurn(1));
        assertEquals("Q", a_player.displayCardOfTurn(2));
    }

    @Test
    void increase_his_score_if_his_card_won_the_duel_with_other_player(){

        a_player.takes(new Card(1));
        otherPlayer.takes(new Card(1));

        a_player.duelWith(otherPlayer);

        assertEquals(1, a_player.getScore());


    }

}
