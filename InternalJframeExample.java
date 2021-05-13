import javax.swing.*;
import java.awt.*;
class InternalJframeExamaple{
	JFrame f;
	JDesktopPane dp;
	JInternalFrame f1, f2;
	public InternalJframeExamaple(){
		f = new JFrame("internal frame example");
		dp = new JDesktopPane();
		f.add(dp);
		f1 = new JInternalFrame("internal frame 1", true, true, true, true);
		f2 = new JInternalFrame("internal frame 2", true, true, true, true);
		f1.setSize(400, 400);
		f2.setSize(400, 400);
		f1.setVisible(true);
		f2.setVisible(true);
		f1.getContentPane().add(new JLabel("this is first internal frame"));
		f2.getContentPane().add(new JLabel("this is second internal frame"));
		dp.add(f1);
		dp.add(f2);
		f.setSize(400, 400);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
		public static void main(String[] args){
			new InternalJframeExamaple();
	}
}
