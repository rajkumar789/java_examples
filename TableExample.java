import javax.swing.*;
public class TableExample
{
	JFrame f;
	TableExample()
	{
		f = new JFrame();
		String data[][] = {{"1","Manisha","98680414178"},{"2","Rajkumar","98680414178"},{"3","Aastha","98680414178"},};
		String column[] = {"ID","Name","Contact"};
		JTable jt = new JTable(data,column);
		jt.setBounds(30,40,200,300);          
    	JScrollPane sp=new JScrollPane(jt);    
    	f.add(sp);          
    	f.setSize(800,800);    
    	f.setVisible(true);
    	JButton jb = new JButton("Exit");
    	f.add(jb);
    	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public static void main(String args[])
	{
		new TableExample();
	}
}