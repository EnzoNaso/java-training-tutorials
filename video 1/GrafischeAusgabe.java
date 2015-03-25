import javax.swing.JOptionPane;

public class GrafischeAusgabe
{
	/** Javadoc-Kommentar */
	public static void main(String[] args)
	{
		//grafische Ausgabe über ein eigenes Fenster
		JOptionPane.showMessageDialog(null, "Hallo Welt!");
		
		/* D. h. ich kann hier eine Menge text reinschreiben,
		 * der mehrere Zeilen lang ist. Der kompiler ingnoriert
		 * diesen text komplett. */
		System.out.println("Hallo World!");
	}
}