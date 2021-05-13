import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class test1 extends JFrame
{
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2,b3;
	test1()
	{
		l1 = new JLabel("Enter any string:");
		l2 = new JLabel();
		t1 = new JTextField();
		b1 = new JButton("Reverrse");
		b2 = new JButton("Cheeck Palindrome");
		b3 = new JButton("Find vowel");
		setLayout(null);
		l1.setBounds(30,50,300,20);
		l2.setBounds(100,250,300,40);
		t1.setBounds(200,50,100,20);
		b1.setBounds(100,100,150,20);
		b2.setBounds(100,150,150,20);
		b3.setBounds(100,200,150,20);
		add(l1);
		add(l2);
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		setSize(500,500);
		setVisible(true);
		b1.addActionListener(new Handler());
		b2.addActionListener(new Handler1());
		b3.addActionListener(new Handler2());
	}
	public class Handler implements ActionListener
	{
	 public void actionPerformed(ActionEvent e)
		{
			String  value = t1.getText();
			String reverse = "";
			for(int i = value.length()-1;i>=0;i--)
			{
				reverse = reverse + value.charAt(i);	
			}
			l2.setText("The reversed word is: " + reverse);
		}
	}
	public class Handler1 implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String  value = t1.getText();
			String reverse = "";
			for(int i=value.length()-1;i>=0;i--)
			{
				 reverse = reverse + value.charAt(i);	
			}

			if(value.equals(reverse))
				{
					l2.setText("The word is Palindrome: " + reverse);
				}
			else
			{
				l2.setText("The word is not Palindrome: " + reverse);
			}
			
		}
	}
	public class Handler2 implements ActionListener
	{
		public void  actionPerformed(ActionEvent e)
		{
			String  value = t1.getText();
			String result = "";
			for(int i=0; i<value.length();i++)
			{
			if(value.charAt(i) == 'a'|| value.charAt(i) == 'e'|| value.charAt(i) == 'i' || value.charAt(i) == 'o' || value.charAt(i) == 'u') 
			{
            	result = result + value.charAt(i);	
			}
			l2.setText("Total vowel in String is: " + result);
		}
	}
}
	public static void main(String args[])
	{
		new test1();
	}
}