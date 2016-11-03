package salestax;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args)
    {
        
        Country brazil=new Country("Brazil");
        Country argentina=new Country("Argentina");
       
        //Inventory(int total_ipods,int cost_of_ipod,int cost_of_export)
        brazil.addInventory(new Inventory(100,100,0.30));
        argentina.addInventory(new Inventory(100,100,0.20));
        
        Scanner input=new Scanner(System.in);
        int orders=input.nextInt();
        
        getTotalCost(orders,brazil,argentina,"Argentina");
        
    }
    public static void getTotalCost(int orders,Country brazil,Country argentina,String cust_country)
    {
        double cost=0;
        for(int order=1;order<=orders;order++)
        {
            double cost_brazil=brazil.getTotalCost(1, cust_country);
            double cost_argentina=argentina.getTotalCost(1, cust_country);
            //System.out.println("Brazil="+(cost+cost_brazil)+"\t"+"Argentina="+(cost+cost_argentina));
            if(cost+cost_brazil<cost+cost_argentina)
            {
                brazil.inventory.commit(1);
                cost+=cost_brazil;
            }
            else
            {
                argentina.inventory.commit(1);
                cost+=cost_argentina;
            }
        }
        System.out.println(cost+":"+brazil.inventory.total_ipods+":"+argentina.inventory.total_ipods);
        //System.out.println("Brazil:"+brazil.inventory.total_ipods);
        //System.out.println("Argentina:"+argentina.inventory.total_ipods);
    }
}
