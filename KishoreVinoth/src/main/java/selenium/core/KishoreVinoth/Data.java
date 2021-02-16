package selenium.core.KishoreVinoth;

/* 
 * Standard:
 * Class/Project			>> NormalNotation
 * Variable/Object/Method	>> camelNotation
 * package					>> small.cases
 * 
 * 8 Primitive types: size and format
 * short(2), int(4), long(8)	>> Numerical whole numbers
 * float(4), double(8)			>> Fractional
 * byte(1)						>> ASCI + UNI
 * char(2)						>> '@' '2' 'A'
 * boolean(4bits/nibble)		>> true/false
 * 
 * Wrapper classes: java.lang
 * Short, Integer, Long, Float, Double, Byte, Character, Boolean
 * 
 * String: collections characters>> class>> java.lang
 * "words"
 * 
 * Type Conversion:
 * a. casting: between data types
 * b. parsing: from STRING to OTHER Classes 
 * eg:
 * String hai="3.4";
 * syntax:
 * object=Wrapper.parseType(String)
 * double ctc=Double.parseDouble(hai);
 * 
 */

public class Data 
{
	public static void main(String[] yet) 
	{
		String role="Java Lead";Short experience=6;String curOrg="Accenture";
		Float curCtc=6.7F;String preLocation="Chennai";
		System.out.println("Zealous Tech Corp");
		System.out.println("Review your submission");
		System.out.println("Role: "+role);// Role: Java Lead
		System.out.println("Experience: "+experience);
		System.out.println("Current Organisation: "+curOrg);
		System.out.println("Current CTC: "+curCtc);
		System.out.println("Preferred location to work: "+preLocation);
	}
}
