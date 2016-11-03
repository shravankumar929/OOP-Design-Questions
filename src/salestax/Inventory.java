package salestax;

public class Inventory {
    public int total_ipods;
    private final int cost_of_ipod;
    private final double cost_of_export;
    public String inventory_country;
    
    Inventory(int total_ipods,int cost_of_ipod,double cost_of_export)
    {
        this.total_ipods=total_ipods;
        this.cost_of_ipod=cost_of_ipod;
        this.cost_of_export=cost_of_export;

    }
    public double sell(String cust_country,int n)
    {
        double export_cost=cost_of_export;
        
        if(cust_country.equals(inventory_country))
            export_cost=0;
        
        
        return (n*cost_of_ipod+(n*cost_of_ipod)*export_cost);
    }
    public void commit(int items)
    {
        total_ipods-=items;
    }
}
