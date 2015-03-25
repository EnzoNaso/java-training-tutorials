import javax.swing.*;

public class EscapeSequenzen
{
	public static void main(String[] args)
	{
		//Escapesequenzen verwenden
		//System.out.println("Erste Zeile \nZeite Zeile");
		
		//Sonderzeichen (Herz)
		//JOptionPane.showMessageDialog(null, "I \u2764 you!");
		
		//tabulator
		System.out.println("Name:\t\tVorname:\tAlter:\t\tWohnort:\n" + 
			"Naso\t\tEnzo\t\t37\t\tAllschwil\n" + 
			"Bello\t\tFelix\t\t32\t\tAllschwil");
	}
}