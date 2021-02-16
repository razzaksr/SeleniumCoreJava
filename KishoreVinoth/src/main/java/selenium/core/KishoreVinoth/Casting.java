package selenium.core.KishoreVinoth;

/*
 * Casting:()
 * destData=(destType)sourceData
 */

public class Casting 
{
	public static void main(String[] args) 
	{
		int roll=122;
		System.out.println(roll);
		System.out.println((char)roll);
		
		float pounds=109.6F;
		System.out.println("Float data: "+pounds);
		
		short kg=(short)pounds;
		System.out.println("Short data: "+kg);
		
		char symbol=(char)kg;
		System.out.println("Character data: "+symbol);
	}
}