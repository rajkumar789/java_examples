import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SumExampleInner extends JFrame
{
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1;

SumExampleInner()
{
	l1 = new JLabel("Enter first number: ");
	l2 = new JLabel("Enter second number: ");
	l3 = new JLabel();
	t1 = new JTextField();
	t2 = new JTextField();
	b1 = new JButton("Add");

setLayout(null);
l1.setBounds(30,50,150,20);
l2.setBounds(30,100,150,20);
t1.setBounds(200,50,100,20);
t2.setBounds(200,100,100,20);
b1.setBounds(100,150,80,20);
l3.setBounds(100,200,80,20);
add(l1);
add(l2);
add(t1);
add(t2);
add(b1);
add(l3);
setSize(500,500);
setVisible(true);
b1.addActionListener(new Handler());
}
public class Handler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		int a,b,sum;
		a = Integer.parseInt(t1.getText());
		b = Integer.parseInt(t2.getText());
		sum = a+b;
		l3.setText("Sum: "+sum);
	}
}
public static void main(String agrs[])
{
	new SumExampleInner();
}
}
