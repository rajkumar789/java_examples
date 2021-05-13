import java.awt.*;
import javax.swing.*;
public class CardDemo extends JFrame
{
	CardDemo()
	{
		CardLayout LayoutManager = new CardLayout();
		setLayout(LayoutManager);
		JButton b1 = new JButton("Button 1");
		JButton b2 = new JButton("Button 2");
		add("first",b1);
		add("second",b2);
		LayoutManager.show(getContentPane(),"second");
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String args[])
	{
		new CardDemo();
	}
}