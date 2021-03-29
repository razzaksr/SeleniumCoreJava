package selenium.core.KishoreVinoth.oop;

public class InnerAsLocal 
{
	public static void main(String[] args) 
	{
		Parent par=new Parent();
		par.list();
		par.Outsource();
	}
}

class Parent
{
	double[] net= {12.4,678.9,3445.234,56.234,67.23,234.67};
	public void list()
	{
		for(double tmp:net) {System.out.println(tmp);}
	}
	public void Outsource()
	{
		//local
		class Provider
		{
			public void reach(int index)
			{
				System.out.println(index+" contains "+net[index]);
			}
		}
		
		Provider pro=new Provider();
		pro.reach(4);
	}
}