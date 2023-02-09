package shoppingcart;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AddItem {
	 static int number;
     static int quantity;
     static int addtotal=0;
    
     static void add() throws InputMismatchException
    {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter item number to be added:\n");
            number = s.nextInt();
            System.out.println("Enter  quantity  of item to be added: ");
            quantity =  s.nextInt();
            Cart.resetSum();
            addtotal += Cart.total(number,quantity);
            
        } catch (Exception e) {
            System.out.println("Invalid input "+ e);
        }
    }
}