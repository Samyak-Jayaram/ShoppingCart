
class Discount
{
    public static int discount(int bill)
    {
        bill = bill - ((bill*20)/100);
        return bill;

    }
}
// if(Bill.bill>1000)
            // {
            //     Bill.bill = Discount.discount(Bill.bill);
            //     final_result.setText("We are giving you a discount of 20% as total exceeds Rs. 1000. Your total bill is Rs. "+String.valueOf(Bill.bill));
            // }
