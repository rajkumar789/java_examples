import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MnemonicExample{
	JFrame f;
	JMenuBar jb;
	JMenu m1,m2;
	JMenuItem i1,i2;
	MnemonicExample(){
		f = new JFrame("MnemonicExample");
		jb = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Edit");
		i1 = new JMenuItem("New");
		i1.setMnemonic(KeyEvent.VK_N);
		i1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,KeyEvent.CTRL_MASK));
		i2 = new JMenuItem("Open");
		i2.setMnemonic(KeyEvent.VK_O);
		i2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.ALT_MASK));
		f.setJMenuBar(jb);
		jb.add(m1);
		jb.add(m2);
		m1.add(i1);
		m1.add(i2);
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		i1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				JFrame f1 = new JFrame("New Frame");
				f1.setSize(400,400);
				f1.add(new JLabel("new menu item is clicked"));
				f1.setVisible(true);
				f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
	}
	public static void main(String[] args){
		new MnemonicExample();
	}
}