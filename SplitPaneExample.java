import javax.swing.*;
import java.awt.*;
public class SplitPaneExample{
	JFrame f;
	JPanel p1,p2;
	JComboBox c1, c2;
	JSplitPane sp;
	public SplitPaneExample(){
		f = new JFrame("SplitPane Example");
		p1 = new JPanel();
		p2 = new JPanel();
		String[] op1 = {"PHP", "Java", "C#", "Python"};
		String[] op2 = {"Mo MO", "Burger", "Noodles", "Pizza"};
		c1 = new JComboBox(op1);
		c2 = new JComboBox(op2);
		p1.add(c1);
		p2.add(c2);
		sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,p1,p2);
		f.add(sp);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setLayout(new FlowLayout());
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args){
		new SplitPaneExample();
	}
}