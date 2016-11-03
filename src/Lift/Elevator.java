package Lift;
import java.util.ArrayList;
public class Elevator {
    private final int Elevator_num;
    private boolean open=false;
    private int curr_floor;
    private Controller controller=null;
    
    Elevator(int Elevator_num,int curr_floor,Controller controller)
    {
        this.Elevator_num=Elevator_num;
        this.curr_floor=curr_floor;
        this.controller=controller;
    }
    public void openDoor(int dest_floor) throws InterruptedException
    {
        
        if(open==false)
        {
            if(dest_floor!=curr_floor)
            {
                System.out.println("Waiting for the elevator to come...!");
                Thread.sleep(2000);
            }
            System.out.println("Open lift"+Elevator_num);
            Thread.sleep(1000);
            open=true;
        }
        else
            System.out.println("Already opened!");
    }
    public void moveToFloor(ArrayList<Integer> requests) throws InterruptedException
    {
        int floor=controller.getNextFloor(requests,curr_floor);
        
        if(floor==-1)
        {
            System.out.println("Invalid floor!");
            return;
        }
        System.out.println("floor="+floor);
        openDoor(floor);
        //int floor=controller.getOrderedFloor(requests);
        //int floor=controller.getRandomFloor(requests);
        curr_floor=requests.get(0);
        requests.remove(new Integer(floor));
        System.out.println("Moving lift"+Elevator_num+" to  the floor "+floor);
        closeDoor();
    }
    public void closeDoor() throws InterruptedException
    {
        if(open)
        {
            System.out.println("Close lift"+Elevator_num);
            Thread.sleep(1000);
            open=false;
        }
        else
            System.out.println("Already closed!");
    }
    public void processReq(ArrayList<Integer> requests) throws InterruptedException
    {
        int size=requests.size();
        for(int req=0;req<size;req++)
        {
            moveToFloor(requests);
            
           // requests.remove(0);
            /*
            System.out.print("[Awaiting requests:");
            for(int r:requests)
                System.out.print(r+" ");
            System.out.println("]");
*/
            //size=requests.size();
        }
    }
    
    
}
