package interview;

import java.util.Scanner;

class Country
{
    public int total_ipods;
    public final int cost_of_ipod;
    public final int cost_of_export;
    public String country;
    
    Country(String country,int total_ipods,int cost_of_ipod,int cost_of_export) 
    {
        this.country=country;
        this.total_ipods=total_ipods;
        this.cost_of_ipod=cost_of_ipod;
        this.cost_of_export=cost_of_export;
    }

    public int sell(int total_items)
    {
        int cost=cost_of_ipod*total_items;
        total_ipods-=total_items;
        return cost;
    }
    public int sell_with_export_price(int total_items)
    {
        int cost=cost_of_ipod*total_items+cost_of_export*total_items;
        total_ipods-=total_items;
        return cost;
    }
}
public class Inventory 
{
    public static int min_cost=0;
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        int total_ipods=100;
        int cost_of_export=400/10;
        
        Country brazil=new Country("Brazil",total_ipods,100,cost_of_export);
        Country argentina=new Country("Argentina",total_ipods,50,cost_of_export);
        
        String country=input.next();
        int ipod_needed=input.nextInt();
        
        if(country.equals("Brazil"))
        {
           if(ipod_needed<=brazil.total_ipods)
           {
                min_cost=brazil.sell(ipod_needed);
           }
           else
           {
               min_cost+=brazil.sell(brazil.total_ipods);
               ipod_needed-=brazil.total_ipods;
               min_cost+=argentina.sell(ipod_needed);
           }
           
           
        }
        else
        {
            if(ipod_needed<=argentina.total_ipods)
           {
                min_cost=argentina.sell(ipod_needed);
           }
           else
           {
               min_cost+=argentina.sell(argentina.total_ipods);
               ipod_needed-=argentina.total_ipods;
               min_cost+=brazil.sell(ipod_needed);
           }
        }
        
        
        System.out.println(min_cost+":"+brazil.total_ipods+":"+argentina.total_ipods);
        
    }
    
}
