package selenium.core.KishoreVinoth.exceptions;

public class Forward 
{
	public static void main(String[] args) 
	{
		try
		{
			String[] items= {"Boat","SkullCandy","JBL","Sony"};
			System.out.println(items[3]);
			throw new NullPointerException();
		}
		catch(NullPointerException np)
		{
			System.out.println(np);
			System.out.println("Caught in catch");
		}
	}
}
