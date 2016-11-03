package interview;
public class Fan 
{
    public static final int SLOW=1,MEDIUM=2,FAST=3;
    int speed;
    boolean f_on;
    double radius;
    String color;
    
    Fan()
    {
        speed=SLOW;
        f_on=false;
        radius=4;
        color="blue";
    }
    
    Fan(int speed,double radius,String color,boolean f_on)
    {
        this.speed=speed;
        this.radius=radius;
        this.color=color;
        this.f_on=f_on;
    }
    public void turnOff()
    {
        if(f_on)
        {
            f_on=false;
            System.out.println("Turned off!");
        }
        else
            System.out.println("Fan is already off!");
    }
    public void setSpeed(int Speed)
    {
        speed=Speed;
        System.out.println("Set speed as "+speed);
    }
    public void turnOn()
    {
        if(!f_on)
        {
            f_on=true;
            System.out.println("Turned on!");
        }
        else
            System.out.println("Fan is already running!");
    }
    public void display()
    {
        if(f_on)
        {
            System.out.println("Fan is on\nThe speed is="+speed+"\nthe color is ="+color);
        }
        else
            System.out.println("Fan is off!");
    }
    public static void main(String[] args)
    {
        Fan fan=new Fan();
        fan.display();
        fan.turnOn();
        fan.turnOff();
        fan.turnOff();
        fan.setSpeed(SLOW);
    }
}
