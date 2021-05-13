import javax.swing.*;
import java.awt.event.*;
public class KeyEventTest extends JFrame implements KeyListener
{
	JLabel l;
	JTextArea a;
	KeyEventTest()
	{
		l = new JLabel();
		l.setBounds(30,50,100,20);
		a = new JTextArea();
		a.setBounds(30,80,300,300);
		a.addKeyListener(this);
		add(l);
		add(a);
		setSize(500,500);
		setLayout(null);
		setVisible(true);
	}
	public void keyPressed(KeyEvent e){
		l.setText("Key pressed");
	}
	public void keyReleased(KeyEvent e){
		l.setText("Key released");
	}
	public void keyTyped(KeyEvent e){
		l.setText("Key Typed");
	}
	public static void main(String args[]){
		new KeyEventTest();
	}
}