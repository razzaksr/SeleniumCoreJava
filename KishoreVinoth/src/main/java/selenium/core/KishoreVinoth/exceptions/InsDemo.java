package selenium.core.KishoreVinoth.exceptions;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class InsDemo 
{
	public static void main(String[] args) 
	{
		Random ran=new Random();
		Scanner scan=new Scanner(System.in);
		int limit=0;
		try
		{
			System.out.println("Enter limit to generate random from that: ");
			limit=scan.nextInt();
		}
		catch(InputMismatchException ie)
		{
			Scanner get=new Scanner(System.in);
			System.out.println(ie);
			System.out.println("Came inside catch");
			System.out.println("Enter limit to generate random from that: ");
			limit=get.nextInt();
		}
		
		for(int times=1;times<=5;times++)
		{
			System.out.println(ran.nextInt(limit));
		}
		
		scan.close();
	}
}
