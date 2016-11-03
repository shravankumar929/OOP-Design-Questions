package SnakeGame;

public class Square {
    public Player player;
    public int position;
    public boolean isLadder;
    public boolean isSnake;
    public boolean isFirstSquare;
    public boolean isLastSquare;
    public boolean isOccupied;
    Square(int position)
    {
        this.position=position;
        
    }
    public void enterPlayer(Player player)
    {
        this.player=player;
    }
    public void leavePlayer()
    {
        this.player=null;
    }
    public void setFirstSquare(boolean firstSquare)
    {
        isFirstSquare=firstSquare;
    }
    public void setLadder(boolean ladder)
    {
        isLadder=ladder;
        position=0;
    }
    public void setSnake(boolean snake)
    {
        isSnake=snake;
        position=-1;
    }
    public void setLastSquare(boolean lastSquare)
    {
        isLastSquare=lastSquare;
    }
    public void setOccupied(boolean occupied)
    {
        isOccupied=occupied;
    }
    public boolean isOccupied()
    {
        return isOccupied;
    }
    public Player getPlayer()
    {
        return player;
    }
    public int getPosition()
    {
        return position;
    }
    
}
