package selenium.core.KishoreVinoth;

import java.util.Scanner;

// Arithmetic operator: + - * / % 

public class Arithmetic
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Liters that's available in your vehicle: ");
		double liter=scan.nextDouble();
		System.out.println("Distance that you have travelled: ");
		int kms=scan.nextInt();
		System.out.println("Tell us km of distance you wish to know fuel consumption: ");
		int distance=scan.nextInt();// 10
		
		//System.out.println("Liters per km: "+(liter/kms));
		//System.out.printf("Liters per km: %.3f",(liter/kms));
		
		System.out.printf("Liters per %d km: %.3f",distance,(liter/kms)*distance);
		
		scan.close();
	}
}