package selenium.core.KishoreVinoth;

import java.util.Scanner;

/*
 * Command Line Argument drawbacks:
 * 1. Since Everything is String, parsing needs to be done manually
 * 2. Since it received as array, fetching element beyond the limit leads 
 * 		ArrayIndexOutOfBounds exception
 * 3. While Parsing to number types, actual string to be converted should have
 * 		 numerical character, otherwise it'll raise NumberFormatExcecption
 * 4. Can't pass inputs while execution
 * 
 * Scanner: java.util>> import java.util.Scanner;
 * 
 * Scanner object=new Scanner(System.in);
 * 
 * methods:
 * to get string input:
 * next>> a word
 * nextLine>> a statement until enter pressed 
 * 
 * nextInt
 * nextShort
 * nextLong
 * nextFloat
 * nextDouble
 * nextBoolean
 * 
 */

public class DynamicInput 
{
	public static void main(String[] args) 
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Select your desired role: ");
		String role=obj.nextLine();
		System.out.println("Current working organisation: ");
		String curOrg=obj.nextLine();
		System.out.println("Preferred location to work: ");
		String preLocation=obj.nextLine();
		
		System.out.println("How many years of experience you have: ");
		Short experience=obj.nextShort();
		
		System.out.println("Current company salary: ");
		Float curCtc=obj.nextFloat();
		
		System.out.println("Zealous Tech Corp");
		System.out.println("Review your submission");
		System.out.println("Role: "+role);// Role: Java Lead
		System.out.println("Experience: "+experience);
		System.out.println("Current Organisation: "+curOrg);
		System.out.println("Current CTC: "+curCtc);
		System.out.println("Preferred location to work: "+preLocation);
		obj.close();
	}
}
