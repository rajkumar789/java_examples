import javax.swing.*;
import java.awt.event.*;
class MouseListenerDemo extends JFrame implements MouseListener
{
	JLabel l;
	MouseListenerDemo()
	{
		addMouseListener(this);
		l = new JLabel();
		l.setBounds(20,50,150,20);
		add(l);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}
	public void mouseClicked(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mousePressed(MouseEvent e){
	l.setText("Mouse Pressed");
}
public void mouseReleased(MouseEvent e){}
public static void main(String agrs[]){
	new MouseListenerDemo();
}
}