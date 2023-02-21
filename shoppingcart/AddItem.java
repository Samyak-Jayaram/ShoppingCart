

import java.util.InputMismatchException;


public class AddItem {
	 static int number;
     static int quantity;
     static int addtotal=0;
    
     static void add(int number,int quantity) throws InputMismatchException
    {
       
            Cart.resetSum();
            addtotal += Cart.total(number,quantity);
    }
}