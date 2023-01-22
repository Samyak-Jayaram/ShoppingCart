package shoppingcart;

import java.util.Scanner;

public class AddItem {
	 static int number;
     static int quantity;
     static int addtotal=0;
    
     static void add()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter item number and it's quantity to be added:\n");
        number = s.nextInt();
        quantity =  s.nextInt();
        Cart.resetSum();
        addtotal += Cart.total(number,quantity);
    }
}