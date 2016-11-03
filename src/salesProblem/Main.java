package salesProblem;
public class Main 
{
    public static void main(String[] args)
    {
        Cart cart=new Cart();
        
        //cart.addItem(ItemName,ItemPrice,IsImported,IsExempted,Num_of_items)
        cart.addItem("book",12.49, false,true,1);
        cart.addItem("music",14.99,true,false,1);
        cart.addItem("chocolate bar",0.85,true,false,1);
        
        System.out.println("Total price="+cart.getPrice());
    }
   
}
