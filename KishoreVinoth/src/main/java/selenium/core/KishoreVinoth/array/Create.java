package selenium.core.KishoreVinoth.array;

import java.util.Arrays;

public class Create 
{
	public static void main(String[] args) 
	{
		int[] alpha= {12,45,33,21,67,87,1,3,91};
		System.out.println(alpha.length);
		
		//listing: O(1)
		System.out.println(Arrays.toString(alpha));
		
		//listing: O(n)>> O(10)
		for(int index=3;index<alpha.length-1;index++) 
		{
			System.out.println(alpha[index]);// read 
		}
		 
		
		//listing: O(n)
		for(int hai:alpha)
		{
			System.out.println(hai);
		}
		
	}
}
