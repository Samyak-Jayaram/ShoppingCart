public class Bill {
   
    static int bill =0;
     
    static void displaybill()
    {
            bill += AddItem.addtotal - DeleteItem.deletetotal;
            Cart.resetSum(true);
    }
}
