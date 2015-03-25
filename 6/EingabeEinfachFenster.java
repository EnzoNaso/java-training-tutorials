import javax.swing.*;

public class EingabeEinfachFenster
{
	public static void main(String[] args)
	{
		//Einfachen Eingabedialog aufrufen
		String nachname = JOptionPane.showInputDialog("Bitte geben Sie Ihren Nachnamen ein:");
		JOptionPane.showMessageDialog(null, "Hallo Herr " + nachname);
		//System.out.println(nachname);
	}
}