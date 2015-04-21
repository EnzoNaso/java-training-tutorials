import javax.swing.*;

public class Zahlenraten
{
	public static void main(String[] args){
		
		String eingabe = "";
		int zahl = 0;
		int zufallszahl = 0;
		int versuche = 0;
		boolean erraten = false;
		
		
		//Zufallszahl zwischen 1 und 100 erzeugen
		zufallszahl = (int)(Math.random()*100+1);
		
		//Zufallszahl
		System.out.println(zufallszahl);
		
		/*
		 *	Dieser Block soll so lange wiederholt werden, bis der Benutzer
		 *	die zufallszahl erraten hat
		 */
		 
		while (!erraten){
		
			eingabe = JOptionPane.showInputDialog(++versuche + ". Rateversuch:");
			
			//Die eingabe in eine ganze Zahl konvertieren (Parsing)
			zahl = Integer.parseInt(eingabe);
			
			/*
			Wenn die eingegebene Zahl der Zufallszahl entspricht, soll dafür gesorgt
			werden, dass die Schleife nicht mehr durchlaufen wird. Ansonsten soll
			ein nachrichtendialog erscheinen, der den Benutzer informiert, ob die
			Zufallszahl kleiner oder grösser als die eingegeene Zahl ist.
			*/
			if(zahl == zufallszahl){
				erraten = true;
			}else if(zahl < zufallszahl){
				JOptionPane.showMessageDialog(null, "Die Zufallszahl ist grösser");
			}else{
				JOptionPane.showMessageDialog(null, "Die Zufallszahl ist kleiner");
			}
		}
		
		JOptionPane.showMessageDialog(null, "Sie haben " + versuche + " geraten, " +
											"um die Zufallszahl " + zufallszahl +
											" zu erraten.");
	}
}