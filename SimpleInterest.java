import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class SimpleInterest extends JFrame
{
	JLabel l1,l2,l3,l4;
	JTextField t1,t2,t3;
	JButton b1;
	SimpleInterest(){
		l1 = new JLabel("Enter Principle:");
		t1 = new JTextField();
		l2 = new JLabel("Enter Time:");
		t2 = new JTextField();
		l3 = new JLabel("Enter Rate:");
		t3 = new JTextField();
		b1 = new JButton("Calculate Simple Interest");
		l4 = new JLabel();
		setLayout(null);
		l1.setBounds(30, 50, 150, 30);
		t1.setBounds(120, 50, 150, 30);
		l2.setBounds(30, 100, 150, 30);
		t2.setBounds(120, 100, 200, 30);
		l3.setBounds(30, 150, 230, 30);
		t3.setBounds(120, 150, 250, 30);
		b1.setBounds(150, 200, 200, 40);
		l4.setBounds(30, 250, 200, 40);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b1);
		add(l4);
		setSize(500, 500);
		setVisible(true);
		b1.addActionListener(new Handler());
	}
	public class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			int p,t,r,simpleiterest;
			p = Integer.parseInt(t1.getText());
			t = Integer.parseInt(t2.getText());
			r = Integer.parseInt(t3.getText());
			simpleiterest = (p*t*r)/100;
			l4.setText("Simpe Interest: " + simpleiterest);
		}
	}
	public static void main(String[] args)
	{
		new SimpleInterest();
	}
}