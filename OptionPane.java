import javax.swing.*;
public class OptionPane{
	public static void main(String[] args){
		int fnum = Integer.parseInt(JOptionPane.showInputDialog("Enter First Number"));
		int snum = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Number"));
		int sum = fnum + snum;
		JOptionPane.showMessageDialog(null, "Sum of two num = " + sum, JOptionPane.PLAIN_MESSAGE);
	}
}