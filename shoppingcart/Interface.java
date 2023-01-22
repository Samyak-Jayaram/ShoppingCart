package shoppingcart;
import java.util.Scanner;

public class Interface {
	    int choice;
	    
	    void show()
	    {
	        System.out.println("Choose one of the following:\n\t1.Display Products\n\t2.Add product\n\t3.Remove product\n\t4.Bill\n\t5.Exit");
	        Scanner s = new Scanner(System.in);
	        for(;;)
	        {
	            System.out.println("Enter choice:\n");
	            choice = s.nextInt();
				switch (choice) 
	        {
	            case 1: DisplayProducts.display();
	                    break;
	            case 2 : AddItem.add();
	                     break;
	            case 3 : DeleteItem.delete();
	                        break;
	            case 4:  Bill.displaybill();
	                        break;
	            case 5 : System.out.println("Exiting");
	                        System.exit(0);
	            default: System.out.println("Choose correct choice");
	                break;
	        }
			}
	        }
	    }
