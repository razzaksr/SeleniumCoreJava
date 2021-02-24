package selenium.core.KishoreVinoth;

import java.util.Scanner;

/*
 * Result: true/false
 * relational: > >= < <= == !=
 * logicals: && || 
 */

public class RelationalAndLogicals 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("-----------------Bajaj FinServ-----------------");
		System.out.println("Tell us Your salary(per annum): ");
		Float ctc=scan.nextFloat();
		System.out.println("Are you eligible for PL of 1lack: "+(ctc>=3.8&&ctc<=6.0));
		System.out.println("Are you eligible for EMI card limit of 50K: "+(ctc>=2.5));
		System.out.println("Tell us your property value: ");
		Float prop=scan.nextFloat();
		System.out.println("Are you eligible for Housing loan of 5Lacks: "+(ctc>=15||prop>=20));
		scan.close();
	}
}
