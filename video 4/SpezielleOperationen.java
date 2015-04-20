public class SpezielleOperationen
{
	public static void main(String[] args)
	{
		//Deklaration
		int i = 0;
		
		//Operationen
		System.out.println(i++);	//i = 1 nach der ausgabe (0)
		System.out.println(++i);	//i = 2 vor der ausgabe	(2)
		System.out.println(1 + i--);	//i = 1 nach der ausgabe (3)
		System.out.println(1 - i--);	//i = 0 vor der ausgabe (0)
		System.out.println(i++ + ++i);	//i = 2 vor der ausgabe (2)
	}
}