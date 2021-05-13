import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class HandlingActionCommandExample extends JFrame implements ActionListener
{
	JLabel lb;
	JButton b1,b2;
HandlingActionCommandExample()
{
	lb = new JLabel();
	lb.setBounds(50,20,200,20);
	setLayout(null);
	b1 = new JButton("Continue");
	b1.setBounds(50,100,100,20);
	b2 = new JButton("ok");
	b2.setBounds(200,100,100,30);
	add(lb);
	add(b1);
	add(b2);
	b1.addActionListener(this);
	b2.addActionListener(this);
	//b1.setAction("proceed");
	//b2.setActioin("proceed");
	setSize(500,500);
	setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
	if(e.getActionCommand()=="Continue");
	lb.setText("Do you want to proceed??");
}
public static void main(String args[])
{
	new HandlingActionCommandExample();
}
}