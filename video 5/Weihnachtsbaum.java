public class Weihnachtsbaum{
	public static void main(String[] args){
		//Variablen deklarieren und initialisieren
		int hoehe = Integer.parseInt(args[0]);
		char zeichen = args[1].charAt(0);
		String baum = "";
		int anzahlZeichen = 1;
		int leerzeichen = hoehe - 1;

		//Baum
		for(int i=0; i < hoehe; i++){
			for(int j=0; j < leerzeichen; j++){
				baum += " ";
			}
			leerzeichen--;

			for(int j=0; j < anzahlZeichen; j++ ){
				baum += zeichen;
			}
			anzahlZeichen += 2;

			baum += "\n";
		}

		//Baumstamm
		for(int i=0; i < hoehe / 2; i++){
			//Leerschitte einfügen (hoehe -1)
			for(int j=0; j < hoehe -1; j++){
				baum += " ";
			}
			baum += zeichen + "\n";
		}
		
		//Ausgabe
		System.out.println(baum);
	}
}
