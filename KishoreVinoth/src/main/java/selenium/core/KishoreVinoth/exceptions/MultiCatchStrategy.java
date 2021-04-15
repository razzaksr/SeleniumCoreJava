package selenium.core.KishoreVinoth.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatchStrategy 
{
	public static void main(String[] args) 
	{
		int[] history= {120,560,0,130,560,670,10};float liters=0.0F;int position=0;
		Scanner scan=new Scanner(System.in);
		try
		{
			System.out.println("Tell us liters filled: ");
			liters=scan.nextFloat();
			System.out.println("Tell us which travel history you gonna compare: ");
			position=scan.nextInt();
			System.out.println("Choosen history: "+history[position]);
			Float res=(liters/history[position]);
			if(Float.isInfinite(res))
				throw new VinothException();
			System.out.println(res+" ml consumed per km");
		}
		catch(InputMismatchException ins)
		{
			System.out.println(ins);
			Scanner scans=new Scanner(System.in);
			try
			{
				System.out.println("Tell us liters filled: ");
				liters=scans.nextFloat();
				System.out.println("Tell us which travel history you gonna compare: ");
				position=scans.nextInt();
				System.out.println("Choosen history: "+history[position]);
				
				
			}
			catch(ArrayIndexOutOfBoundsException ar)
			{
				System.out.println(ar);
				System.out.println("Tell us which travel history you gonna compare: ");
				position=scans.nextInt();
				System.out.println("Choosen history: "+history[position]);
				System.out.println((liters/history[position])+" ml consumed per km");
			}
		}
		catch(ArrayIndexOutOfBoundsException ar)
		{
			System.out.println(ar);
			System.out.println("Tell us which travel history you gonna compare: ");
			position=scan.nextInt();
			System.out.println("Choosen history: "+history[position]);
			System.out.println((liters/history[position])+" ml consumed per km");
		}
		 catch (VinothException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Tell us which travel history you gonna compare besides 2nd one: ");
				position=scan.nextInt();
				System.out.println("Choosen history: "+history[position]);
				Float res=(liters/history[position]);
				System.out.println(res+" ml consumed per km");
			}
		
		//System.out.println(((float)20/120)*120);
		
		scan.close();
	}
}
