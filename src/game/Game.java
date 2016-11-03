package game;
import java.util.Stack;
public class Game {
    private Player[] players;
    private int cardsPerPlayer;
    Stack<Card> stackOfCards=Deck.getShuffledDeck();
    
    Game(Player[] players)
    {
        this.players=players;
        this.cardsPerPlayer=0;
    }
    Game(Player[] players,int cardsPerPlayer)
    {
        this.players=players;
        this.cardsPerPlayer=cardsPerPlayer;
    }
    public void dealCards()
    {
        int playerCount=players.length;
        if(playerCount>0)
        {
            int cardsToDeal=cardsPerPlayer==0?stackOfCards.size():cardsPerPlayer*playerCount;
            for(int i=0;i<cardsToDeal;i++)
            {
                players[i%playerCount].addCard(stackOfCards.pop());
            }
        }
    }
    public Stack<Card> getStackOfCards()
    {
        return stackOfCards;
    }
}
