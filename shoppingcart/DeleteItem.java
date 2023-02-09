package shoppingcart;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteItem 
{       static int number;
        static int quantity;
        static int deletetotal=0;
	    
        static void delete() throws InputMismatchException
    {
        try {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter item number to be deleted:\n");
            number = s.nextInt();
            System.out.println("Enter  quantity  of item to be deleted: ");
            quantity =  s.nextInt();
            Cart.resetSum();
            deletetotal += Cart.total(number,quantity);
            }
        catch (Exception e) {
                System.out.println("Invalid input "+ e);
        }
    }
}