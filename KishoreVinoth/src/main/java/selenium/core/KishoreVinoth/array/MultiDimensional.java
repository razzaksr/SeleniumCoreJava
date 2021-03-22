package selenium.core.KishoreVinoth.array;

import java.util.Arrays;

public class MultiDimensional 
{
	public static void main(String[] args) 
	{
		//type[][] var={{},{},{}};
		//type[][] var=new type[row][col];
		String[][] teams= {{"Razak","Rasheedha"},{"Sabari","Ragu"},{"Nathan","Mohamed"}};
		/*
		 * System.out.println(Arrays.toString(teams[0]));
		 * System.out.println(Arrays.toString(teams[1]));
		 * System.out.println(Arrays.toString(teams[2]));
		 */
		// row
		for(int row=0;row<teams.length;row++)
		{
			// column index
			for(int index=0;index<teams[row].length;index++)
			{
				System.out.println("Row is "+row+" Column is "+index+" "+teams[row][index]);
			}
		}
		
	}
}

