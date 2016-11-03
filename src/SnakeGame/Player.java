package SnakeGame;

public class Player {
    String name;
    public int position;
    
    Player(String name)
    {
        this.name=name;
        position=1;
    }
    public void moveForward(int squares)
    {
        System.out.println("Moving player "+name+" to "+(position+squares));
        position+=squares;
    }
    public void moveToPosition(int dest)
    {
        System.out.println("Moving player "+name+" to "+dest);
        position=dest;
    }
}
