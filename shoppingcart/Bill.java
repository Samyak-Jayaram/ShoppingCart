package shoppingcart;

public class Bill {
    static int bill = AddItem.addtotal - DeleteItem.deletetotal;
     static void displaybill()
    {
        if (bill<0)
        {
            System.out.println("You are trying to remove more products than the ones in shopping cart");
        }
        
        else
        {
            System.out.println("Total amount is: "+ bill);
        }
    }
}
