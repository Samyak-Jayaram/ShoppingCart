import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

public class Gui implements java.awt.event.ActionListener{

    JFrame frame = new JFrame();

    JLabel heading = new JLabel();
    JLabel img1 = new JLabel();
    JLabel img2 = new JLabel();
    JLabel img3 = new JLabel();
    JLabel des1 = new JLabel();
    JLabel des2 = new JLabel();
    JLabel des3 = new JLabel();
    JLabel res_1 = new JLabel();
    JLabel res_2 = new JLabel();
    JLabel res_3 = new JLabel();
    JLabel final_result = new JLabel();
    JLabel info = new JLabel();

    JButton button_1 = new JButton("+");
    JButton button_2 = new JButton("-");
    JButton button_3 = new JButton("+");
    JButton button_4 = new JButton("-");
    JButton button_5 = new JButton("+");
    JButton button_6 = new JButton("-");
    JButton display_button = new JButton("Grand total");

    int val1,val2,val3;
    int a,b,c,d,e1,f;

    Gui()
    {
    heading.setBounds(600,0,500,100);
    heading.setFont(new Font("Times New Roman",Font.BOLD,40));
    heading.setText("Shopping cart application");
    heading.setHorizontalTextPosition(JLabel.CENTER);
    heading.setForeground(new Color(0x0054972));
    heading.setBackground(new Color(0x039B4B1));

    info.setBounds(350,50,1000,100);
    info.setFont(new Font("Times New Roman",Font.BOLD,30));
    info.setText("The following items are available.Choose the quantity of items required:");
    info.setHorizontalTextPosition(JLabel.CENTER);
    info.setForeground(new Color(0x0DE5E45));


    des1.setBounds(170,100,1000,100);
    des1.setFont(new Font("Times New Roman",Font.BOLD,30));
    des1.setText("Pen-set");
    des1.setHorizontalTextPosition(JLabel.CENTER);
    des1.setForeground(new Color(0x0A7C99));

    ImageIcon penset = new ImageIcon("penset.png");
    img1.setIcon(penset);
    img1.setBounds(100,105,500,500);
    img1.setText("Rs 100");
    img1.setFont(new Font("Times New Roman",Font.BOLD,25));
    img1.setHorizontalTextPosition(JLabel.CENTER);
    img1.setVerticalTextPosition(JLabel.BOTTOM);
    img1.setForeground(new Color(0x039B4B1));


    des2.setBounds(650,100,1000,100);
    des2.setFont(new Font("Times New Roman",Font.BOLD,30));
    des2.setText("Geometry box");
    des2.setHorizontalTextPosition(JLabel.CENTER);
    des2.setForeground(new Color(0x0A7C99));


    ImageIcon geometry_box = new ImageIcon("geometry.png");
    img2.setIcon(geometry_box);
    img2.setBounds(500,90,500,500);
    img2.setText("Rs 150");
    img2.setFont(new Font("Times New Roman",Font.BOLD,25));
    img2.setIconTextGap(-160);
    img2.setHorizontalTextPosition(JLabel.CENTER);
    img2.setVerticalTextPosition(JLabel.BOTTOM);
    img2.setForeground(new Color(0x039B4B1));

    des3.setBounds(1150,100,1000,100);
    des3.setFont(new Font("Times New Roman",Font.BOLD,30));
    des3.setText("Marker set");
    des3.setHorizontalTextPosition(JLabel.CENTER);
    des3.setForeground(new Color(0x0A7C99));
    
    ImageIcon marker = new ImageIcon("marker.png");
    img3.setIcon(marker);
    img3.setBounds(1000,80,500,500);
    img3.setText("Rs 200");
    img3.setFont(new Font("Times New Roman",Font.BOLD,25));
    img3.setIconTextGap(-100);
    img3.setHorizontalTextPosition(JLabel.CENTER);
    img3.setVerticalTextPosition(JLabel.BOTTOM);
    img3.setForeground(new Color(0x039B4B1));
    

   button_1.setBounds(100,500,50,50);
   button_1.setFocusable(false);
   button_1.addActionListener(this);


   button_2.setBounds(300,500,50,50);
   button_2.setFocusable(false);
   button_2.addActionListener(this);


   res_1.setBounds(200,500,40,40);
   res_1.setFont(new Font("Times New Roman",Font.BOLD,30));
   res_1.setText(String.valueOf(val1));
   res_1.setHorizontalTextPosition(JLabel.CENTER);


   button_3.setBounds(600,500,50,50);
   button_3.setFocusable(false);
   button_3.addActionListener(this);

   button_4.setBounds(850,500,50,50);
   button_4.setFocusable(false);
   button_4.addActionListener(this);

   res_2.setBounds(730,500,40,40);
   res_2.setFont(new Font("Times New Roman",Font.BOLD,30));
   res_2.setText(String.valueOf(val2));
   res_2.setHorizontalTextPosition(JLabel.CENTER);



   button_5.setBounds(1100,500,50,50);
   button_5.setFocusable(false);
   button_5.addActionListener(this);

   button_6.setBounds(1350,500,50,50);
   button_6.setFocusable(false);
   button_6.addActionListener(this);


   res_3.setBounds(1235,500,40,40);
   res_3.setFont(new Font("Times New Roman",Font.BOLD,30));
   res_3.setText(String.valueOf(val3));
   res_3.setHorizontalTextPosition(JLabel.CENTER);


   display_button.setBounds(600,600,300,50);
   display_button.setFocusable(false);
   display_button.setFont(new Font("Times New Roman",Font.BOLD,20));
   display_button.addActionListener(this);



   final_result.setBounds(600,700,1000,100);
   final_result.setFont(new Font("Times New Roman",Font.BOLD,30));
   final_result.setText("Your total bill is: "+String.valueOf(Bill.bill));
   final_result.setHorizontalTextPosition(JLabel.CENTER);

   Image icon = Toolkit.getDefaultToolkit().getImage("cart.png");    
    frame.setIconImage(icon);    

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(1000,1000);
    frame.setLayout(null);
    
    
    frame.add(heading);
    frame.add(img1);
    frame.add(img2);
    frame.add(img3);
    frame.add(des1);
    frame.add(des2);
    frame.add(des3);
    frame.add(button_1);
    frame.add(button_2);
    frame.add(button_3);
    frame.add(button_4);
    frame.add(button_5);
    frame.add(button_6);
    frame.add(res_1);
    frame.add(res_2);
    frame.add(res_3);
    frame.add(display_button);
    frame.add(final_result);
    frame.add(info);
    
    frame.setVisible(true);

}

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        if(e.getSource()==button_1)
        {
            
            if(val1>=0)
            {
                val1+=1;
                a++;
                res_1.setText(String.valueOf(val1));
                AddItem.add(1, a);
                a=0;
            }
        }

        if(e.getSource()==button_2)
        {
            if(val1>0)
            {
                val1-=1;
                b++;
                res_1.setText(String.valueOf(val1));
                DeleteItem.delete(1,b);
                b=0;
            }
        }


        if(e.getSource()==button_3)
        {
            
            if(val2>=0)
            {
                val2+=1;
                c++;
                res_2.setText(String.valueOf(val2));
                AddItem.add(2, c);
                c=0;
            }
        }


        if(e.getSource()==button_4)
        {
            if(val2>0)
            {
                val2-=1;
                d++;
                res_2.setText(String.valueOf(val2));
                DeleteItem.delete(2,d);
                d=0;
            }
        }

        if(e.getSource()==button_5)
        {
            
            if(val3>=0)
            {
                val3+=1;
                e1++;
                res_3.setText(String.valueOf(val3));
                AddItem.add(3, e1);
                e1=0;
            }
        }


        if(e.getSource()==button_6)
        {
            if(val3>0)
            {
                val3-=1;
                f++;
                res_3.setText(String.valueOf(val3));
                DeleteItem.delete(3,f);
                f=0;
            }
        }

        if(e.getSource()==display_button)
        {
            
            Bill.displaybill();
            if(Bill.bill<0)
            {
                Bill.bill = 0;
                final_result.setText("Your total bill is Rs. "+String.valueOf(Bill.bill));
            }

            
            final_result.setText("Your total bill is Rs. "+String.valueOf(Bill.bill));
        }
        
    }

   
}