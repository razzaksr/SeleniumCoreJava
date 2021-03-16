package selenium.core.KishoreVinoth.array;

import java.util.Arrays;

/*
 * Sorting Algorithms:
 * O(n2)>> selection, bubble, insertion
 * O(nlogn)>> quick,merge,heap
 */

public class Sortings 
{
	public static void main(String[] args) 
	{
		double[] cost= {988.4,12.99,345.9,1200.98,1345.8,290.7,498.5,3200.4};
		System.out.println("\nListing All");
		for(double tmp:cost) {System.out.println(tmp);}
		
		
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
		
		
		System.out.println("\nListing All");
		for(double tmp:cost) {System.out.println(tmp);}
		
		
		String[] teams= {"Vinoth","Sasi","Aravind","Riyaz","Arunachalam","Kishore"};
		System.out.println(Arrays.toString(teams));
		
		//Bubble sort: O(n2)
		String third="";
		for(int times=0;times<teams.length-1;times++)
		{
			for(int bubble=0;bubble<teams.length-times-1;bubble++)
			{
				if(teams[bubble].compareTo(teams[bubble+1])>0)
				{
					third=teams[bubble];
					teams[bubble]=teams[bubble+1];
					teams[bubble+1]=third;
				}
			}
		}
		
		System.out.println(Arrays.toString(teams));
	}
}
