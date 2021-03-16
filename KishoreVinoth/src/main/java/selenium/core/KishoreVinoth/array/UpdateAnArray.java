package selenium.core.KishoreVinoth.array;

public class UpdateAnArray 
{
	public static void main(String[] args) 
	{
		double[] cost= {988.4,12.99,345.9,1200.98,1345.8,290.7,498.5,3200.4};
		System.out.println("\nListing All");
		for(double tmp:cost) {System.out.println(tmp);}
		System.out.println("Update based on offer");
		// update All: O(n)
		for(int index=0;index<cost.length;index++)
		{
			cost[index]-=(cost[index]*0.050);
		}
		System.out.println("\nListing All");
		for(double tmp:cost) {System.out.println(tmp);}
		System.out.println("Update based on condition");
		for(int index=0;index<cost.length;index++)
		{
			if(cost[index]>=500 && cost[index]<=1000)
			{
				cost[index]-=(cost[index]*0.500);
			}
		}
		System.out.println("\nListing All");
		for(double tmp:cost) {System.out.println(tmp);}
	}
}
