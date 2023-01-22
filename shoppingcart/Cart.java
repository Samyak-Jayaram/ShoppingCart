package shoppingcart;
import java.util.HashMap;

public class Cart {
     
     static HashMap<Integer,Integer> items = new HashMap<Integer, Integer>(); 
     static int[] cost = new int[]{ 10,20,30}; 
     static int totalsum = 0;


     public static void resetSum() {
        Cart.totalsum = 0;
    }


    static int total(int number , int quantity)
    {
        
            items.put(number,cost[number-1]);
            totalsum +=items.get(number)*quantity;
            return totalsum;
    }
}

