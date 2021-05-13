import java.awt.*;
import javax.swing.*;
public class FlowLayoutExample extends JFrame
{
	FlowLayoutExample()
	{
		for(int i=1;i<6;i++)
		{
			add(new JButton("Button"+i));
		}
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setSize(500,500);
		setVisible(true);
}
	public static void main(String args[])
	{
		new FlowLayoutExample();
	}
}