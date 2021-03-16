package selenium.core.KishoreVinoth.array;

import java.util.Scanner;

public class Searching 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double[] cost= {988.4,12.99,345.9,1200.98,1345.8,290.7,498.5,3200.4};
		System.out.println("TEll us value to find position: ");
		double value=scan.nextDouble();
		// linear search: O(n)
		for(int index=0;index<cost.length;index++)
		{
			if(value==cost[index])
			{
				System.out.println(index+" position for "+value);
			}
		}
		
		scan.close();
	}
}
