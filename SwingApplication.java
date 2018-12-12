package TutorialPoint;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class SwingApplication 
{

	public static void main(String[] args) 
	{
		final JFrame frame = new JFrame("password field demo");
		JLabel label = new JLabel("User Name: ");
		JTextField uname = new JTextField (20);
		JLabel plabel = new JLabel("Password: ");
		JPasswordField pass = new JPasswordField (20);
		JButton subbtn = new JButton("submit");
		JButton cancelbtn = new JButton ("cancel");
		JButton addbtn = new JButton ("add");
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(label);
		panel.add(uname);
		panel.add(plabel);
		panel.add(pass);
		panel.add(subbtn);
		panel.add(cancelbtn);
		panel.add(addbtn);
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 150);
		frame.setVisible(true);
			
		cancelbtn.addActionListener(new PerformAction());
		subbtn.addActionListener(new PerformAction());
		addbtn.addActionListener(new PerformAction());
		
		
		frame.getContentPane().add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(350, 150);
		frame.setVisible(true);
			
		cancelbtn.addActionListener(new PerformAction());
		subbtn.addActionListener(new PerformAction());
		addbtn.addActionListener(new PerformAction());
	}

}

class PerformAction implements ActionListener
{
	
	public void actionPerformed(ActionEvent arg0) 
	{
		String caption = arg0.getActionCommand();
		if (caption.equals("submit")) 
		{
		System.out.println("Logged In SuccessFull !");
		}
		
		else if (caption.equals("cancel")) 
		{
			System.out.println("Are you sure, you want to exit?");	
		}
		else if (caption.equals("add")) 
		{
			System.out.println("Enter another user ");	
		}
	}
}