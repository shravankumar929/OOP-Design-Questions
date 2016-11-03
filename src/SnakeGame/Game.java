package SnakeGame;
import java.util.ArrayList;
import java.util.Map;
public class Game {
    public Die dice;
    public ArrayList<Player> players;
    public int numSquares;
    public Map<Integer,Integer> ladders;
    public Map<Integer,Integer> snakes;
    public Square[] square;
    public static final int ladder=0;
    public static final int snake=-1;
    
    Game(ArrayList<Player> players,int numSquares,Map<Integer,Integer> ladders,Map<Integer,Integer> snakes)
    {
        this.players=players;
        this.numSquares=numSquares;
        this.ladders=ladders;
        this.snakes=snakes;
        square=new Square[numSquares];
        dice=new Die();
        //createPlayer(players);
        createGame(numSquares,ladders,snakes);
        play();
    }
    private void createGame(int numSquares,Map<Integer,Integer> ladders,Map<Integer,Integer> snakes)
    {
        //create first square
        square[0]=new Square(1);
        square[0].setFirstSquare(true);
        square[0].setOccupied(true);
        //set 0 for ladder and -1 for snake
        for(int i=1;i<numSquares-1;i++)
        {
            square[i]=new Square(i+1);
            square[i].setFirstSquare(false);
            square[i].setOccupied(false);
            if(ladders.containsKey(i+1))
            {
                square[i].setLadder(true);
            }
            if(snakes.containsKey(i+1))
            {
                square[i].setSnake(true);
            }
        }
        square[numSquares-1]=new Square(numSquares);
        square[numSquares-1].setLastSquare(true);
        square[numSquares-1].setOccupied(false);
    }
    private void createPlayer(ArrayList<Player> players)
    {
        
    }
    private void play()
    {
     
        while(true)
        {
            for(int i=0;i<players.size();i++)
            {
                int dice_num=dice.roll();
                int position=(dice_num+players.get(i).position)%numSquares;
                //System.out.println("Position= "+position+" square_pos= "+square[position].getPosition());
               
                if(square[position].getPosition()==ladder)
                {
                    players.get(i).moveToPosition(ladders.get(position+1));
                    System.out.println("Player "+players.get(i).name+" got ladder");
                   
                }
                else if(square[position].getPosition()==snake)
                {
                    players.get(i).moveToPosition(snakes.get(position+1));
                    System.out.println("Player "+players.get(i).name+" got snake");
                   
                }
                else
                   players.get(i).moveForward(dice_num); 
                
                if(players.get(i).position>=numSquares)
                {
                    System.out.println("Player "+players.get(i).name+" is won the game");
                    return;
                }
            }
        }
    }
}
