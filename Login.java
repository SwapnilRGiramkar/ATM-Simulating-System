//Day one we Create a Login page 
package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener
{
	JLabel l1,l2,l3;
	JTextField tf1;
	JPasswordField pf1;
	JButton btnLogin,btnClear,btnSignup;
	
	Login()
	{
		setTitle("ATM SIMULATING SYSTEM");
		setVisible(true);
		setSize(800,500);
		setLocation(400,200);
		
		//changing background color of frame 
		getContentPane().setBackground(Color.white);
		
		//to disable default layout of frame 
		setLayout(null);
		l1=new JLabel ("Welcome To ATM");
		l1.setFont(new Font("Ariel",Font.BOLD,35));
		l1.setBounds(200,40,630,40);
		add(l1);
		
		l2=new JLabel ("Enter Card No :");
		l2.setFont(new Font("Tahoma",Font.BOLD,25));
		l2.setBounds(120,150,400,30);
		add(l2);
		
		tf1=new JTextField(20);
		tf1.setBounds(320,155,230,30);
		tf1.setFont(new Font("Tahoma",Font.BOLD,15));
		add(tf1);
		
		l3=new JLabel ("Enter PIN No :");
		l3.setFont(new Font("Tahoma",Font.BOLD,25));
		l3.setBounds(120,230,400,30);
		add(l3);
		
		pf1=new JPasswordField(20);
		pf1.setBounds(320,230,230,30);
		pf1.setFont(new Font("Tahoma",Font.BOLD,15));
		add(pf1);
		
		//add button
		btnLogin=new JButton("Login.");
		btnLogin.setBackground(Color.BLACK);
		btnLogin.setForeground(Color.WHITE);
		
		btnClear=new JButton("Clear");
		btnClear.setBackground(Color.BLACK);
		btnClear.setForeground(Color.WHITE);
		
		btnSignup=new JButton("Sign Up");
		btnSignup.setBackground(Color.BLACK);
		btnSignup.setForeground(Color.WHITE);
		
		btnLogin.setFont(new Font("Tahoma",Font.BOLD,15));
		btnLogin.setBounds(300,300,100,40);
		add(btnLogin);
		
		btnClear.setFont(new Font("Tahoma",Font.BOLD,15));
		btnClear.setBounds(450,300,100,40);
		add(btnClear);

		btnSignup.setFont(new Font("Tahoma",Font.BOLD,15));
		btnSignup.setBounds(375,350,100,40);
		add(btnSignup);
		
		//Attaching a Listener
		btnLogin.addActionListener(this);
		btnClear.addActionListener(this);
		btnSignup.addActionListener(this);

		
	}
	
	public static void main(String[] args)
	{
		//creating login class object 
		new Login();

	}

	//This method runs Automatically when you click any button 
	@Override
	public void actionPerformed(ActionEvent ae) 
	{
		try 
		{
			if(ae.getSource()==btnLogin)
			{
				//This is for login purpose
			}
			else if(ae.getSource()==btnClear)
			{
				tf1.setText("");
				pf1.setText("");
				//This is for clear purpose
			}
			else if(ae.getSource()==btnSignup)
			{
				//This is for sign up purpose
			}
		} 
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
	}

}

