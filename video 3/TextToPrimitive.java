import javax.swing.*;

public class TextToPrimitive
{
	public static void main(String[] args)
	{
		String eingabe1 = JOptionPane.showInputDialog("1. Zahl:");
		String eingabe2 = JOptionPane.showInputDialog("2. (ganze) Zahl:");
		
		double zahl1 = Double.parseDouble(eingabe1);
		int zahl2 = Integer.parseInt(eingabe2);
		
		JOptionPane.showMessageDialog(null, zahl1 + zahl2);
	}
}