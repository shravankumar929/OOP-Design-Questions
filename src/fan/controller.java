package fan;
public class controller {
    public int max_speed;
    public int curr_speed;
    
    controller(int speed)
    {
        max_speed=speed;
        curr_speed=0;
    }
    public void changeSpeed(int speed)
    {
        if(speed<=max_speed)
        {
            curr_speed=speed;
            System.out.println("Setting speed to "+curr_speed);
        }
        else
            System.out.println("Fan is at maximum speed!");
    }
}
