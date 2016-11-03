package game;
import java.util.Stack;
public class Player {
    private String name;
    private Stack<Card> cards;
    
    Player(String name)
    {
        this.name=name;
        this.cards=new Stack<Card>();
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public Stack<Card> getCards()
    {
        return cards;
    }
    public void setCards(Stack<Card> cards)
    {
        this.cards=cards;
    }
    public void addCard(Card card)
    {
        cards.push(card);
    }
    public void removeCard(Card card)
    {
        this.cards.remove(card);
    }
}
