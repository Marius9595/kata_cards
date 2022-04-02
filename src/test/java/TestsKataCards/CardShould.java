package TestsKataCards;

import KataCards.ResultOfDuel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import KataCards.Card;

public class CardShould {

    @Test
    void pass_happy_test(){
        assertEquals(1,1);
    }

    private Card lowestCard;
    private Card highestCard;

    @BeforeEach
    void setUp(){
         lowestCard = new Card(1);
         highestCard = new Card(10);
    }

    @Test
    void when_face_to_other_card_lose_win_or_tie_according_to_ranking(){

        assertEquals(ResultOfDuel.LOST, lowestCard.faceTo(highestCard));
        assertEquals(ResultOfDuel.WON, highestCard.faceTo(lowestCard));
        assertEquals(ResultOfDuel.TIE, lowestCard.faceTo(lowestCard));
    }

}
