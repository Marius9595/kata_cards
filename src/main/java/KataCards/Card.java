package KataCards;

public class Card {

    private int rankingValue;

    public Card(int rankingValue) {
        this.rankingValue = rankingValue;
    }

    public ResultOfDuel faceTo(Card card) {

        if(this.rankingValue > card.rankingValue){
            return ResultOfDuel.WON;
        }else if(this.rankingValue < card.rankingValue){
            return ResultOfDuel.LOST;
        }
        return ResultOfDuel.TIE;
    }
}
