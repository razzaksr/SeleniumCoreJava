package selenium.core.KishoreVinoth;

/*
 * BODMAD/BUDMAS:
 * bracket
 * of/unary
 * div
 * mul
 * add
 * sub
 */

public class Precedence 
{
	public static void main(String[] args) 
	{
		short maxim=45, hayato=98, alok=76;
		//System.out.println("Result is: "+((maxim<<=4)+(alok++)*(hayato/=2)));
		//720+76*49
		System.out.println("Result is: "+((hayato>>=2)*(--maxim)/(hayato-=3)-(alok*=3)));
		//24*44/21-228
	}
}
