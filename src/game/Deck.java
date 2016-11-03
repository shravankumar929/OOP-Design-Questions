package game;
import java.util.Random;
import java.util.Stack;
public class Deck {
    public static Stack<Card> getNewSortedDeck()
    {
        Stack<Card> cardDeck=new Stack<Card>();
        
        for(CardShape shape:CardShape.values())
        {
            for(CardNumber number:CardNumber.values())
            {
                Card card=new Card(shape,number);
                cardDeck.push(card);
            }
        }
        return cardDeck;
    }
    public static Stack<Card> getShuffledDeck()
    {
        return getShuffledDeck(getNewSortedDeck());
    }
    public static Stack<Card> getShuffledDeck(Stack<Card> deck)
    {
        Stack<Card> cardDeck=new Stack<Card>();
        int count=0;
        for(int i=deck.size();i>0;i--)
        {
            Random random=new Random();
            Card randomCard=deck.remove(random.nextInt(i));
            cardDeck.push(randomCard);
        }
        
        return cardDeck;
    }
    public static void printDeck(Stack<Card> deck)
    {
        for(int i=0;i<deck.size();i++)
        {
            System.out.println("Adding Random Card No. "+(i+1)+" to the Deck: "+deck.get(i).getName());
        }
    }
}
