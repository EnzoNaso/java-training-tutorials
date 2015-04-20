import javax.swing.*;

public class GleichheitBeiTexten
{
	public static void main(String[] args)
	{
		String eingabe = JOptionPane.showInputDialog("Bitte einen Text Eingeben:");
		
		JOptionPane.showMessageDialog(null, eingabe == "Enzo");	//geht nicht
		JOptionPane.showMessageDialog(null, eingabe.equals("Enzo"));	//geht
		JOptionPane.showMessageDialog(null, args[0].equals("Enzo"));	//geht
					
	}
}