package salestax;

public class Country {
    public Inventory inventory;
    public String country_name;
    
    Country(String country_name)
    {
        this.country_name=country_name;
    }
    public void addInventory(Inventory inventory)
    {
        this.inventory=inventory;
        this.inventory.inventory_country=country_name;
    }
    public double getTotalCost(int items,String cust_country)
    {
        return inventory.sell(cust_country, items);
    }
    public void printInfo()
    {
        System.out.println(inventory.total_ipods);
    }
}
