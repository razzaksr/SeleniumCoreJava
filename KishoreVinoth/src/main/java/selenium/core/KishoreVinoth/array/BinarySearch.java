package selenium.core.KishoreVinoth.array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch 
{
	public void selection(double[] cost)
	{
		//selection sort: O(n2)
		//select
		for(int select=0;select<cost.length;select++)
		{
			//comparison
			for(int com=select+1;com<cost.length;com++)
			{
				if(cost[select]>cost[com])
				{
					cost[select]*=cost[com];
					cost[com]=cost[select]/cost[com];
					cost[select]/=cost[com];
				}
			}
		}
	}
	
	public int binary(double[] set,int beg,int end,double data)
	{
		
		
			int midPoint=(beg+end)/2;
			if(set[midPoint]==data)
				return midPoint;
			else if(set[midPoint]>data)
				return binary(set,beg,midPoint,data);
			else if(set[midPoint]<data)
				return binary(set,midPoint+1,end,data);
			else
				return -1;
		
	}
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		double[] cost= {988.4,12.99,345.9,1200.98,1345.8,290.7,498.5,3200.4};
		System.out.println(Arrays.toString(cost));
		BinarySearch bin=new BinarySearch();
		bin.selection(cost);
		System.out.println(Arrays.toString(cost));
		System.out.println("TEll us value to find position: "); 
		double value=scan.nextDouble();
		int position=bin.binary(cost, 0, cost.length-1, value);
		System.out.println(position+" holds the "+value);
		scan.close();
	}
}
