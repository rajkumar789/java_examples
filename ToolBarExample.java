import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ToolBarExample{
	JFrame f;
	JMenuBar br;
	JMenu m1,m2;
	JToolBar tb;
	JButton b1,b2,b3;
	JLabel lb;
	ToolBarExample(){
		f = new JFrame("ToolBar Example");
		br = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Edit");
		tb = new JToolBar("File ToolBar");
		b1 = new JButton("Save");
		b2 = new JButton("Open");
		b3 = new JButton("Print");
		tb.addSeparator();
		br.add(m1);
		br.add(m2);
		tb.add(b1);
		tb.addSeparator();
		tb.add(b2);
		tb.addSeparator();
		tb.add(b3);
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setJMenuBar(br);
		f.add(tb, BorderLayout.NORTH);
		b1.addActionListener(new ActionListener (){
			@Override
		public void actionPerformed(ActionEvent e){
			lb = new JLabel("Save button is clicked");
			f.add(lb, BorderLayout.CENTER);
		}
	});
	}
	public static void main(String[] args){
		new ToolBarExample();
	}

}