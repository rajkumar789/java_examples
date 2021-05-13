import java.awt.*;
import javax.swing.*;
class MenuExample
{
	JFrame f1;
	JMenuBar br;
	JMenu mn;
	JCheckBoxMenuItem c1, c2;
	JRadioButtonMenuItem r1, r2;
	MenuExample()
	{
		f1 = new JFrame ("Menu Example");
		br = new JMenuBar();
		mn = new JMenu("File");
		c1 = new JCheckBoxMenuItem("Apple");
		c2 = new JCheckBoxMenuItem("Mango");
		r1 = new JRadioButtonMenuItem("Item 1");
		r2 = new JRadioButtonMenuItem("Item 2");
		ButtonGroup bg = new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		mn.add(c1);
		mn.add(c2);
		mn.add(r1);
		mn.add(r2);
		br.add(mn);
		f1.setJMenuBar(br);
		f1.setSize(400, 400);
		f1.setLayout(new FlowLayout());
		f1.setVisible(true);
	}
	public static void main(String args[])
	{
		new MenuExample();
	}
} 