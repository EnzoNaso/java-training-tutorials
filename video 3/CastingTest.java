//import javax.swing.*;

public class CastingTest
{
	public static void main(String[] args)
	{
		byte b = 0;
		short s = 513;
		
		b = (byte)s;			//implizierte 0000 0010 0000 0001 -> 0000 0001

		System.out.println(b);
	}
}