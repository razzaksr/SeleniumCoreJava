package selenium.core.KishoreVinoth.array;

import java.util.Scanner;

public class CreateDynamic 
{
	public static void main(String[] args) 
	{
		double[] exp=new double[10];
		Scanner scan=new Scanner(System.in);
		
		//insertion:O(n)
		for(int index=0;index<exp.length;index++) {
			System.out.println("Enter the experience: "); 
			exp[index]=scan.nextDouble(); 
		}
		 
		/*
		 * for(double sit:exp) { System.out.println("Enter the experience: ");
		 * sit=scan.nextDouble(); }
		 */
		
		//listing: O(n)
		for(double yet:exp)
		{
			System.out.println(yet);
		}
		scan.close();
	}
}
