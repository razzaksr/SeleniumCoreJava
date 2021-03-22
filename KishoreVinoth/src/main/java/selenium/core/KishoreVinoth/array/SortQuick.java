package selenium.core.KishoreVinoth.array;

import java.util.Arrays;

public class SortQuick 
{
	public static int order(int[] hey,int beg,int end)
	{
		int third;
		int pyData=hey[end];
		int position=beg-1;
		for(int index=beg;index<end;index++)
		{
			if(hey[index]<pyData)
			{
				position++;
				third=hey[position];
				hey[position]=hey[index];
				hey[index]=third;
			}
		}
		
		
		third=hey[position+1];
		hey[position+1]=hey[end];
		hey[end]=third;
		
		return position+1;
	}
	public static void quick(int[] ware,int beg,int end)
	{
		if(beg<end)
		{
			int pyPoint=order(ware,beg,end);
			quick(ware,beg,pyPoint-1);
			quick(ware,pyPoint+1,end);
		}
	}
	public static void main(String[] args) 
	{
		int[] yet= {98,45,112,56,9,67,49,54,6,19};
		SortQuick.quick(yet, 0, yet.length-1);
		System.out.println(Arrays.toString(yet));
	}
}
