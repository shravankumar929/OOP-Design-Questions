package SnakeGame;
import java.util.Random;
public class Die {
    public int roll()
    {
        return new Random().nextInt(7);
    }
}
