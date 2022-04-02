package TestsKataCards;

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
        var lowestCard = new Card(1);
        var highestCard = new Card(10);
    }

    @Test
    void when_face_to_other_card_lose_win_or_tie_according_to_ranking(){
        
        assertEquals(Result.WON,lowestCard.faceTo(highestCard));
        assertEquals(Result.LOST,highestCard.faceTo(lowestCard));
        assertEquals(Result.TIE,lowestCard.faceTo(lowestCard));
    }

}
