import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TabbedPaneExample{
	JFrame f;
	JPanel p1,p2,p3;
	JTabbedPane tp;
	public TabbedPaneExample(){
		f = new JFrame("TabbedPane Example");
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p1.setBackground(Color.RED);
		p2.setBackground(Color.BLUE);
		p3.setBackground(Color.PINK);
		tp = new JTabbedPane();
		tp.add("Red", p1);
		tp.add("Blue", p2);
		tp.add("Pink", p3);
		tp.setBounds(50, 50, 200, 200);
		f.add(tp);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new TabbedPaneExample();
	}
}