package shoppingcart;
import java.util.HashMap;

public class Cart {
     
     static HashMap<Integer,Integer> items = new HashMap<Integer, Integer>(); 
     static int[] cost = new int[]{ 100,150,200}; 
     static int totalsum = 0;


     public static void resetSum() 
    {
        Cart.totalsum = 0;
    }
    public static void resetSum(Boolean done) 
    {
        if (done)
        {
            AddItem.addtotal = 0;
            DeleteItem.deletetotal= 0;
        }
    }


    static int total(int number , int quantity)
    {
        
            items.put(number,cost[number-1]);
            totalsum +=items.get(number)*quantity;
            return totalsum;
    }
}

