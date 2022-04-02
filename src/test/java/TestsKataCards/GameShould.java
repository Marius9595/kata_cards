package TestsKataCards;

import KataCards.Game;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import KataCards.Card;
import KataCards.Player;


class GameShould {

    private Player onePlayer;
    private Player otherPlayer;

    @BeforeEach
    void setUp(){
        onePlayer = new Player();
        onePlayer.name = "Player 1";
        otherPlayer = new Player();
        otherPlayer.name = "Player 2";

        onePlayer.takes(new Card(1));
        otherPlayer.takes(new Card(11));
        onePlayer.takes(new Card(10));
        otherPlayer.takes(new Card(2));
        onePlayer.takes(new Card(2));
        otherPlayer.takes(new Card(2));

    }


    @Test
    void display_result_for_each_duel(){

        onePlayer.takes(new Card(1));
        otherPlayer.takes(new Card(11));

        onePlayer.takes(new Card(10));
        otherPlayer.takes(new Card(2));

        onePlayer.takes(new Card(2));
        otherPlayer.takes(new Card(2));



        assertEquals(onePlayer.name + " lost against " + otherPlayer.name + " in the turn", onePlayer.duelWith(otherPlayer));
        assertEquals(onePlayer.name + " and " + otherPlayer.name + " get a Tie in the turn", onePlayer.duelWith(otherPlayer));
        assertEquals(onePlayer.name + " won against " + otherPlayer.name + " in the turn", onePlayer.duelWith(otherPlayer));
    }

}