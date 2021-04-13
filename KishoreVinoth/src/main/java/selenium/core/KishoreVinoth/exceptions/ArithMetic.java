package selenium.core.KishoreVinoth.exceptions;

import java.util.Scanner;

public class ArithMetic 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int kms=0,liter=0;
		
		try
		{
			System.out.println("Enter the kms");
			kms=scan.nextInt();
			System.out.println("Enter the fuel");
			liter=scan.nextInt();
			System.out.println(kms/liter);
		}
		catch(ArithmeticException ar)
		{
			System.out.println(ar);
			System.out.println("Enter the fuel besides value 0");
			liter=scan.nextInt();
			System.out.println(kms/liter);
		}
		
		
		scan.close();
	}
}
