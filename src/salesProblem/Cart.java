package salesProblem;

import java.util.ArrayList;

public class Cart {
    public ArrayList<Item> items=new ArrayList<>();
    public double total_price=0;
    Item newItem=null;
    public void addItem(String item,double itemPrice,boolean isImported,boolean isExempted,int total_items)
    {
        newItem=new Item(item,itemPrice,isImported,isExempted,total_items);
        items.add(newItem);
    }
    public double getPrice()
    {
        for(int i=0;i<items.size();i++)
        {
            double price=items.get(i).getPrice();
            System.out.println(items.get(i).total_items+" "+items.get(i).itemName+" :"+price);
            total_price+=price;
        }
        return total_price;
    }
}
