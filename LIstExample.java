import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class ListExample{
	JFrame f;
	JList list;
	public ListExample(){
		f = new JFrame("List Example");
		f.setLayout(new FlowLayout());
		String[] listcol = {"Red", "Green", "Blue", "Cyan", "Black", "Orange"};
		Color[] color = {Color.red, Color.green, Color.blue, Color.cyan, Color.black, Color.orange};
		list = new JList(listcol);
		list.setVisibleRowCount(4);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		f.add(new JScrollPane(list));
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		list.addListSelectionListener(new ListSelectionListener(){
			public void valueChanged(ListSelectionEvent e){
				f.getContentPane().setBackground(cLIolor[list.getSelectedIndex()]);
			}

		});
	}
		public static void main(String[] args){
			new ListExample();
		}
		
}