package KataCards;

public class Card {

    private String[] figures = {"1","2","3","4","5","6","7","8","9","J","Q","K"};

    private int rankingValue;
    private String figure;


    public Card(int rankingValue) {
        this.rankingValue = rankingValue;
        this.figure = figures[this.rankingValue - 1];
    }

    public ResultOfDuel faceTo(Card card) {

        if(this.rankingValue > card.rankingValue){
            return ResultOfDuel.WON;
        }else if(this.rankingValue < card.rankingValue){
            return ResultOfDuel.LOST;
        }
        return ResultOfDuel.TIE;
    }

    public String displayFigure() {
        return this.figure;
    }
}
