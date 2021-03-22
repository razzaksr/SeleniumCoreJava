package selenium.core.KishoreVinoth.array;

import java.util.Scanner;

public class MultiCreate 
{
	public static void main(String[] args) 
	{
		int[][] exp=new int[3][3];
		Scanner scan=new Scanner(System.in);
		
		for(int row=0;row<exp.length;row++)
		{
			for(int index=0;index<exp.length;index++)
			{
				System.out.println("Tell us value: ");
				exp[row][index]=scan.nextInt();
			}
		}
		
		
		for(int[] row:exp)
		{
			for(int col:row)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
