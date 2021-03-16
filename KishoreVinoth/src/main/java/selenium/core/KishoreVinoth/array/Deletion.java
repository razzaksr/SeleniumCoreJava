package selenium.core.KishoreVinoth.array;

public class Deletion 
{
	public static void main(String[] args) 
	{
		double[] cost= {988.4,12.99,345.9,1200.98,1345.8,290.7,498.5,3200.4};
		System.out.println("Delete based on condition");
		for(int index=0;index<cost.length;index++)
		{
			if(cost[index]>=300 && cost[index]<=1000)
			{
				cost[index]=0;
			}
		}
		System.out.println("\nListing All");
		for(double tmp:cost) {System.out.println(tmp);}
	}
}
