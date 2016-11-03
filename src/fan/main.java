package fan;
public class main {
    public static void main(String[] args)
    {
        fan myfan=new fan(false,"TableFan",5);
        
        myfan.turnOnFan();
        
        myfan.setSpeed(3);
        myfan.setSpeed(5);
        
        myfan.turnOffFan();
    }
}
