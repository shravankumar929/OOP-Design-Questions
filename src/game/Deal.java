package game;
public class Deal {
    public static void main(String[] args)
    {
        Player player1=new Player("Player1");
        Player player2=new Player("Player2");
        Player player3=new Player("Player3");
        Player player4=new Player("Player4");
        
        Player[] players={player1,player2,player3,player4};
        Game game=new Game(players);
        game.dealCards();
        
        System.out.println("Player1 cards");
        Deck.printDeck(player1.getCards());
        
        System.out.println("Player2 cards");
        Deck.printDeck(player2.getCards());
        
        System.out.println("Player3 cards");
        Deck.printDeck(player3.getCards());
        
        System.out.println("Player4 cards");
        Deck.printDeck(player4.getCards());
        
        System.out.println("Remaing cards");
        Deck.printDeck(game.getStackOfCards());
        
        
    }
}
