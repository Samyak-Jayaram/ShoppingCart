package shoppingcart;
import java.util.Scanner;

public class Discount {
 static int coupon_number = 2;

 
 public static void options()
 {
    System.out.println("As a first time customer ,you have 2  discount coupons.Each provide 10% off on all products.");
    int choice;
    System.out.println("1.Avail discount\n\t2.Don't avail it\n");
    Scanner s = new Scanner(System.in);
    choice = s.nextInt();
    if (choice ==1 && coupon_number !=0)
    {
        System.out.println("You currently have "+ coupon_number + "coupons");
        for(int i=0;i<Cart.cost.length;i++)
        {
            Cart.cost[i] /= 10;
        }
        coupon_number -=1;
    }
    if(coupon_number ==0)
    {
        System.out.println("You  are out of discount coupons.");
    }
    if(choice==2)
    {
        System.out.println("You still have "+ coupon_number);
    }

 }
}
