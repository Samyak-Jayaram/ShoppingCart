
import java.util.InputMismatchException;


public class DeleteItem 
{       static int number;
        static int quantity;
        static int deletetotal=0;
	    
        static void delete(int number,int quantity) throws InputMismatchException
    {
            Cart.resetSum();
            deletetotal += Cart.total(number,quantity);
    }
      
}