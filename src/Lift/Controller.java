package Lift;

import java.util.ArrayList;
import java.util.Random;

public class Controller {
    public int max_floor;
    Controller(int max_floor)
    {
        this.max_floor=max_floor;
    }
    public int getNextFloor(ArrayList<Integer> requests,int curr_floor)
    {
        if(requests.size()<1)
            return -1;
        int min_floor=Integer.MAX_VALUE;
        for(int i:requests)
        {
            if(min_floor>Math.abs(i-curr_floor))
                min_floor=i;
        }
        return (min_floor<=max_floor) ? min_floor:-1;
    }
    public int getRandomFloor(ArrayList<Integer> requests)
    {
        int floor=new Random().nextInt(requests.size());
        return (floor<=max_floor) ? floor:-1;
    }
    public int getOrderedFloor(ArrayList<Integer> requests)
    {
        int floor=requests.get(0)<=max_floor?requests.get(0):-1;
        return (requests.size()>0?floor:-1);
    }
}
