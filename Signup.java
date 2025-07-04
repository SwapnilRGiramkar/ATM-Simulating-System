//Today we Create a signup page using Java,swing and awt.
package bank_management_system;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup extends JFrame
{
	//All are the instance variable
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JRadioButton r1,r2,r3,r4,r5;
	JButton b;
	
	Random r=new Random();
	long randnum=r.nextLong()%9000+1000;
	String number=""+Math.abs(randnum);
	//No Argument Constructor
	public Signup() 
	{
		 setTitle("Application Form For New Account");
		 setLayout(null);
		 
		 l1=new JLabel("Application Form : "+number);
		 l1.setFont(new Font("Raleway",Font.BOLD,35));
		 l1.setBounds(180,20,600,40);
		 add(l1);
		 
		 l2=new JLabel(" Personal Details ");
		 l2.setFont(new Font("Arial",Font.BOLD,25));
		 l2.setBounds(275,70,600,30);
		 add(l2);
		 
		 l3=new JLabel(" Yr.Name: ");
		 l3.setFont(new Font("Arial",Font.BOLD,22));
		 l3.setBounds(80,110,200,30);
		 add(l3);
		 
		 tf1=new JTextField(15);
		 tf1.setBounds(285,110,300,30);
		 tf1.setFont(new Font("Ariel",Font.BOLD,22));
		 add(tf1);
		 
		 
		 l4=new JLabel(" Father Name: ");
		 l4.setFont(new Font("Arial",Font.BOLD,22));
		 l4.setBounds(80,150,200,30);
		 add(l4);
		 
		 tf2=new JTextField(15);
		 tf2.setBounds(285,150,300,30);
		 tf2.setFont(new Font("Ariel",Font.BOLD,22));
		 add(tf2);
		 
		 l5=new JLabel(" Gender: ");
		 l5.setFont(new Font("Arial",Font.BOLD,22));
		 l5.setBounds(80,190,200,30);
		 add(l5);
		 
		 r1=new JRadioButton("Male");
		 r1.setFont(new Font("Tahoma",Font.BOLD,14));
		 r1.setBackground(Color.WHITE);
		 r1.setBounds(285,190,100,30);
		 add(r1);
		 
		 r2=new JRadioButton("Female");
		 r2.setFont(new Font("Tahoma",Font.BOLD,14));
		 r2.setBackground(Color.white);
		 r2.setBounds(385,190,100,30);
		 add(r2);
		 
		 r3=new JRadioButton("Other");
		 r3.setFont(new Font("Tahoma",Font.BOLD,14));
		 r3.setBackground(Color.white);
		 r3.setBounds(485,190,100,30);
		 add(r3);
		 
		 ButtonGroup bgGender=new ButtonGroup();
		 bgGender.add(r1);
		 bgGender.add(r2);
		 bgGender.add(r3);
		 
		 l6=new JLabel(" Date Of Birth: ");
		 l6.setFont(new Font("Arial",Font.BOLD,22));
		 l6.setBounds(80,230,200,30);
		 add(l6);
		 
		 l7=new JLabel(" Email Address: ");
		 l7.setFont(new Font("Arial",Font.BOLD,22));
		 l7.setBounds(80,270,200,30);
		 add(l7);
		 
		 tf3=new JTextField(15);
		 tf3.setBounds(285,270,300,30);
		 tf3.setFont(new Font("Ariel",Font.BOLD,22));
		 add(tf3);
		 
		 l8=new JLabel(" Marital Status: ");
		 l8.setFont(new Font("Arial",Font.BOLD,22));
		 l8.setBounds(80,310,200,30);
		 add(l8);
		 
		 		 r4=new JRadioButton("Married");
		 r4.setFont(new Font("Tahoma",Font.BOLD,14));
		 r4.setBackground(Color.white);
		 r4.setBounds(300,310,150,30);
		 add(r4);
		 
		 r5=new JRadioButton("Un-Married");
		 Font f=new Font("Tahoma",Font.BOLD,14);
		 r5.setFont(f);
		 r5.setBackground(Color.white);
		 r5.setBounds(450,310,200,30);
		 add(r5);
		 
		 ButtonGroup bgMarital= new ButtonGroup();
		 bgMarital.add(r4);
		 bgMarital.add(r5);
		 
		 l9=new JLabel(" Address: ");
		 l9.setFont(new Font("Arial",Font.BOLD,22));
		 l9.setBounds(80,350,200,30);
		 add(l9);
		 
		 tf4=new JTextField(15);
		 tf4.setBounds(285,350,400,30);
		 tf4.setFont(new Font("Ariel",Font.BOLD,22));
		 add(tf4);
		 
		 l10=new JLabel(" City: ");
		 l10.setFont(new Font("Arial",Font.BOLD,22));
		 l10.setBounds(80,390,200,30);
		 add(l10);
		 
		 tf5=new JTextField(15);
		 tf5.setBounds(285,390,300,30);
		 tf5.setFont(new Font("Ariel",Font.BOLD,22));
		 add(tf5);
		 
		 l11=new JLabel(" Pin Code: ");
		 l11.setFont(new Font("Arial",Font.BOLD,22));
		 l11.setBounds(80,430,200,30);
		 add(l11);
		 
		 tf6=new JTextField(15);
		 tf6.setBounds(285,430,300,30);
		 tf6.setFont(new Font("Ariel",Font.BOLD,22));
		 add(tf6);
		 
		 l12=new JLabel(" State: ");
		 l12.setFont(new Font("Arial",Font.BOLD,22));
		 l12.setBounds(80,470,200,30);
		 add(l12);
		 
		 tf7=new JTextField(15);
		 tf7.setBounds(285,470,300,30);
		 tf7.setFont(new Font("Ariel",Font.BOLD,22));
		 add(tf7);
		 
		 l13=new JLabel(" Date: ");
		 l13.setFont(new Font("Arial",Font.BOLD,22));
		 l13.setBounds(80,510,200,30);
		 add(l13);
		 
		 l14=new JLabel(" Month: ");
		 l14.setFont(new Font("Arial",Font.BOLD,22));
		 l14.setBounds(80,550,200,30);
		 add(l14);
		 
		 l15=new JLabel(" Year: ");
		 l15.setFont(new Font("Arial",Font.BOLD,22));
		 l15.setBounds(80,590,200,30);
		 add(l15);
		 
		 b=new JButton("Next");
		 b.setFont(f);
		 b.setBackground(Color.BLACK);
		 b.setForeground(Color.WHITE);
		 b.setBounds(300, 640, 150, 40);
		 add(b);
		 
		 setVisible(true);
		 setSize(770,750);
		 setLocation(400,70);
		 getContentPane().setBackground(Color.WHITE);
		 
	}
	
	public static void main(String[] args) 
	{
		new Signup();
	}
}

