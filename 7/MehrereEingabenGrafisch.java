import javax.swing.*;

public class MehrereEingabenGrafisch
{
	public static void main(String[] args)
	{
		//Eingabefelder aufbauen
		JTextField[] feld = {new JTextField(), new JTextField(), new JTextField()};
		Object[] msg = {"Vorname:", feld[0], "Alter:", feld[1], "Hobby:", feld[2]};
		
		//Dialogfenster anzeigen
		//JOptionPane.showConfirmDialog(null, msg, "Eingabe", JOptionPane.YES_NO_OPTION);
		//JOptionPane.showConfirmDialog(null, msg, "Eingabe", JOptionPane.YES_NO_CANCEL_OPTION);
		JOptionPane.showConfirmDialog(null, msg, "Eingabe", JOptionPane.OK_CANCEL_OPTION);
		
		//Benutzereingaben erfragen
		JOptionPane.showMessageDialog(null, "Vorname:" + feld[0].getText() + "\n" +
			"Alter: " + feld[1].getText() + "\n" +
			"Hobby: " + feld[2].getText());
		
	}
}