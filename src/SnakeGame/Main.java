package SnakeGame;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Main {
    public static void main(String[] args)
    {
        //String[] playerNames={"Shravan","chintu"};
        ArrayList<Player> players=new ArrayList<>();
        players.add(new Player("Shravan"));
        players.add(new Player("Chintu"));
        players.add(new Player("Pandu"));
        int numSquares=100;
        Map<Integer,Integer> snakesFromTo=new HashMap<>();
        snakesFromTo.put(11,5);
        snakesFromTo.put(20,10);
        snakesFromTo.put(98,2);
        snakesFromTo.put(45,23);
        
        Map<Integer,Integer> laddersFromTo=new HashMap<>();
        laddersFromTo.put(2,6);
        laddersFromTo.put(7,9);
        laddersFromTo.put(21,55);
        
        Game game=new Game(players,numSquares,laddersFromTo,snakesFromTo);
    }
}
