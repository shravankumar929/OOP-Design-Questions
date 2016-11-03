package Lift;
import java.util.ArrayList;
import java.util.Scanner;
public class ElevatorSystem {
    public static int no_of_floors;
    public static Controller controller;
    public static ArrayList<Integer> requests;

    public static void main(String[] args) throws InterruptedException
    {
        
        Scanner input=new Scanner(System.in);
        no_of_floors=input.nextInt();
        
        //controller which controls moving of lifts
        controller=new Controller(no_of_floors);
        
        //adding elevators to the system
        //false means elevator is closed at the beginning
        Elevator ele1=new Elevator(1,3,controller);
        Elevator ele2=new Elevator(2,1,controller);
        Elevator ele3=new Elevator(3,3,controller);
        Elevator ele4=new Elevator(4,2,controller);
        
        //add requests
        requests=new ArrayList<>();
        requests.add(1);
        requests.add(0);
        requests.add(3);
        requests.add(2);
        
        ele1.processReq(requests);
        
        requests.add(3);
        requests.add(1);
        requests.add(0);
        requests.add(2);
        ele2.processReq(requests);
        
        requests.add(2);
        requests.add(1);
        requests.add(3);
        requests.add(0);
        ele3.processReq(requests);
        
        requests.add(2);
        requests.add(1);
        requests.add(0);
        requests.add(3);
        ele4.processReq(requests);
        
        if(System.out.printf("hai")!=null)
        {
            
        }
        
    }
}
