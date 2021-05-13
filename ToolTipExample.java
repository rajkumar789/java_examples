import javax.swing.*;
import java.awt.*;
public class ToolTipExample{
	JFrame f;
	JPasswordField pf;
	JLabel lb;
	ToolTipExample(){
		f = new JFrame("ToolTip Example");
		pf = new JPasswordField(15);
		pf.setToolTipText("Enter your password: ");
		lb = new JLabel("Password");
		f.add(lb);
		f.add(pf);
		f.setSize(400,400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
	}
	public static void main(String[] args){
		new ToolTipExample();
	}
}