package selenium.core.KishoreVinoth.exceptions;

import java.util.Scanner;

public class FiniteChances
{
	static Scanner scan=new Scanner(System.in);
	static int kms,liter;
	static int times=0;
	public static void handle()
	{
		times++;
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
			if(times<=2)
				handle();
			else 
			{
				System.out.println("Max attempt obtained/reached");
				return;
			}
		}
	}
	public static void main(String[] args) 
	{
		FiniteChances.handle();
	}
}
