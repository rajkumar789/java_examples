import javax.swing.*;
import java.awt.*;
public class Demo extends JFrame
{
	JMenuBar jmb;
	JMenu m1, m2;
	JMenuItem i1,i2,i3,i4,i5,i6;
	Demo()
	{
		jmb = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Edit");
		jmb.add(m1);
		jmb.add(m2);
		i1 = new JMenuItem("New");
		i2 = new JMenuItem("Save");
		i3 = new JMenuItem("Save as");
		i4 = new JMenuItem("Exit");
		i5 = new JMenuItem("Undo");
		i6 = new JMenuItem("Redo");
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.add(i4);
		m2.add(i5);
		m2.add(i6);
		setLayout(new FlowLayout());
		setTitle("JFrame Example");
		setSize(300, 300);
		setJMenuBar(jmb);
		setVisible(true);
	}
public static void main(String agrs[])
{
	new Demo();
}
}
