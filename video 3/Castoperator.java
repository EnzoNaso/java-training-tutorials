//import javax.swing.*;

public class Castoperator
{
	public static void main(String[] args)
	{
		byte b = 112;
		short s = 20100;
		int i = 34500000;
		long l = 12L;
		float f = 3.23F;
		double d = 25.36;
		
		//implizierte und explizierte Datenkonvertierung
		d = b;			//implizierte
		i = (int)l;		//explizierte
		f = (float)d;
		i = s;
		d = l;
		s = (short)i;
			
	}
}