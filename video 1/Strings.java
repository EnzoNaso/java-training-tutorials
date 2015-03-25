public class Strings
{
	public static void main(String[] args)
	{
		//Stringvariable deklarieren und initialisieren
		String einKleinerText = "Hallo";
		
		//konkateration demostrieren
		
		/* 2 varaibeln von Typ String deklarieren und mit 
		 * werte belegen */
		String vorname = "Enzo";
		String nachname = "Naso";
		
		/* Eine weitere Variable erstellen, die den Nachnamen 
		 * und danach den vornamen enthält.*/
		String ausgabe = nachname + ", " + vorname;
				
		//Variable auf der Kommandoebene ausgeben
		System.out.println(ausgabe);
	}
}