import javax.swing.*;

public class Variablendeklaration
{
	public static void main(String[] args)
	{
	
		/* Prmitive Datentypen
		boolean 1	byte
		char 	2	byte
		byte 	1	byte
		short 	2	byte
		int 	4	byte	Standard
		long 	8	byte
		float 	4	byte
		double 	8	byte	Standard
		*/

		String meinText;
		
		//deklaration und Initialisierung
		int a = 5;
		int b = 6;
		
		//Wertzuweisung
		b = a;
		
		//Ausgabe über die Konsole
		System.out.println(b);
		
		int c = 5, d = 6;
		double e = 4.356, f = 15.963;
		
		byte g = 3, h;
		h = 9;
		
		long u = 9000000000L; 		//9 Milliarden L für Long sonst copilierfehler
		System.out.println(3000000000L); //9 Milliarden L für Long sonst copilierfehler
		
		float z = 3.24F; //F für float sonst wird double verwendet
		
	}
}