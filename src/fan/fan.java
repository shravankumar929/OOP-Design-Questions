package fan;
public class fan {
    /*
    public String name;
    public String brand;
    public int num_of_wings;
    */
    public boolean state;
    public String type;
    public static controller control;
    public int maxSpeed;
    
    fan(boolean state,String type,int maxSpeed)
    {
        this.state=state;
        this.type=type;
        this.maxSpeed=maxSpeed;
        control=new controller(maxSpeed);
    }
    
    public void turnOnFan()
    {
        state=true;
        System.out.println("Turning on the fan");
    }
    public void turnOffFan()
    {
        state=false;
        System.out.println("Turning off the fan");
    }
    public void setSpeed(int speed)
    {
        if(state)
            control.changeSpeed(speed);
    }
    public void setType(String type)
    {
        this.type=type;
    }
    public String getType()
    {
        return type;
    }
    
    /*
    public void setName(String name)
    {
        this.name=name;
    }
    
    public void setBrand(String brand)
    {
        this.brand=brand;
    }
    public void setWings(int num)
    {
        this.num_of_wings=num;
    }
    
    public String getName()
    {
        return name;
    }
    public String getBrand()
    {
        return brand;
    }
    public int getWings()
    {
        return num_of_wings;
    }
    public String getType()
    {
        return type;
    }
    */
}
