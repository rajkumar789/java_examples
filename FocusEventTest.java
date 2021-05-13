import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FocusEventTest extends JFrame implements FocusListener{
	JTextField t1,t2,t3;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JButton b;
	FocusEventTest(){
		l1 = new JLabel("First Value");
		l2 = new JLabel("Second Value");
		l3 = new JLabel("Result");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		t3 = new JTextField(10);
		b = new JButton("Multiply");
		t1.addFocusListener(this);
		t2.addFocusListener(this);
		b.addFocusListener(this);
		setLayout(new FlowLayout());
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(l3);
		add(t3);
		add(b);
		setSize(500,500);
		setVisible(true);
	}
	public void focusGained(FocusEvent fe){
		int x,y,z;
		if(fe.getSource()==(b)){
			x = Integer.parseInt(t1.getText());
			y = Integer.parseInt(t2.getText());
			z = x*y;
			t3.setText(String.valueOf(z));
		}
	}
	public void focusLost(FocusEvent fe){
		if(fe.getSource()==t1 && t1.getText().equals("")){
			JOptionPane.showMessageDialog(this, "Enter number to continue");
			t1.requestFocus();
		}
		if(fe.getSource()==t2 && t2.getText().equals("")){
			JOptionPane.showMessageDialog(this, "Enter number to continue");
			t2.requestFocus();
		}
	}
	public static void main(String args[]){
		new FocusEventTest();
	}
}