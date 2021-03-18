package selenium.core.KishoreVinoth.array;

import java.util.Arrays;

public class PassingThroughMethods 
{
	public void list(double[] hai)
	{
		System.out.println("Listing");
		for(double tmp:hai) {System.out.println(tmp);}
	}
	public void update(double[] dry)
	{
		System.out.println("Though i receive all array: "+Arrays.toString(dry)+" i wish to change "+dry[2]);
		dry[2]-=(dry[2]*0.900);
		System.out.println("After i updated "+dry[2]);
	}
	public void alter(double yet)
	{
		System.out.println(yet+" is data received in alter");
		yet+=(yet*0.800);
		System.out.println(yet+" is updated data");
	}
	public static void main(String[] args) 
	{
		PassingThroughMethods pass=new PassingThroughMethods();
		double[] cost= {988.4,12.99,345.9,1200.98,1345.8,290.7,498.5,3200.4};
		pass.list(cost);
		pass.alter(6.7);
		pass.alter(cost[4]);
		System.out.println(cost[4]+" in main");
		pass.update(cost);
		System.out.println(cost[2]+" in main");
	}
}
