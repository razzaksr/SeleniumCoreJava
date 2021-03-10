package selenium.core.KishoreVinoth;

public class NestedLoopTables 
{
	public static void main(String[] args) 
	{
		for(int table=1;table<=10;table++)
		{
			System.out.println("Table "+table+" has started");
			for(int steps=1;steps<=10;steps++)
			{
				System.out.println(steps+" X "+table+" = "+(steps*table));
			}
			System.out.println();
		}
	}
}
