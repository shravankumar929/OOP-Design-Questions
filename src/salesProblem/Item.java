package salesProblem;

public class Item {
    
    public static double salesTax=0.1;
    public static double importedTax=0.05;
    public boolean isImported;
    public boolean isExempted;
    public String itemName;
    public double itemPrice;
    public int total_items;
    
    Item(String itemName,double itemPrice,boolean isImported,boolean isExempted,int total_items)
    {
        this.itemName=itemName;
        this.itemPrice=itemPrice;
        this.isImported=isImported;
        this.isExempted=isExempted;
        this.total_items=total_items;
    }
    
    
    public double getPrice()
    {
        if(!isImported)
            importedTax=0.0;
        if(itemName.equalsIgnoreCase("BOOK")||itemName.equalsIgnoreCase("MEDICAL")||itemName.equalsIgnoreCase("FOOD"))
            salesTax=0.0;
        
        double price=itemPrice*total_items;
        
        price+=price*salesTax+price*importedTax;
        
        return price;
    }
}
