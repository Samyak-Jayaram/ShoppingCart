package shoppingcart;

public class Bill {
    static int bill =0; 
    static void displaybill()
    {
        if (bill<0)
        {
            System.out.println("You are trying to remove more products than the ones in shopping cart");
        }
        
        else
        {
            bill += AddItem.addtotal - DeleteItem.deletetotal;
            Cart.resetSum(true);
            System.out.println("Total amount is: "+ bill + " Rs.");
        }
    }
}
