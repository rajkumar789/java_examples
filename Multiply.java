import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Multiply extends JFrame{
	JLabel l1,l2, l3;
	JTextField t1,t2;
	JButton b1;
	Multiply()
	{
		l1 = new JLabel("Enter first number:");
		t1 = new JTextField();
		l2 = new JLabel("Enter second number:");
		t2 = new JTextField();
		b1 = new JButton("Multiply");
		l3 = new JLabel();
		setLayout(null);
		l1.setBounds(30, 50, 150, 20);
		t1.setBounds(150, 50, 150, 30);
		l2.setBounds(30, 100, 150, 30);
		t2.setBounds(170, 100, 180, 30);
		b1.setBounds(180, 150, 100, 30);
		l3.setBounds(200, 200, 150, 30);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
		add(l3);
		setSize(500, 500);
		setVisible(true);
		b1.addActionListener(new Handler());
	}
	public class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
		int a,b,result;
		a = Integer.parseInt(t1.getText());
		b = Integer.parseInt(t2.getText());
		result = a + b;
		l3.setText("Result: " + result);
		}
	}
	public static void main(String[] args)
	{
		new Multiply();
	}
}