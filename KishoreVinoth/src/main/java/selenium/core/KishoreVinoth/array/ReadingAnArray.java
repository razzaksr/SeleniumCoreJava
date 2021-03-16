package selenium.core.KishoreVinoth.array;

public class ReadingAnArray 
{
	public static void main(String[] args) 
	{
		String[] teams= {"Vinoth","Sasi","Aravind","Riyaz","Arunachalam","Kishore"};
		
		System.out.println(teams[1]);//reading by index/position: O(1)
		
		//read by range: O(n)
		System.out.println("\nRead by Range");
		for(int pos=2;pos<teams.length-2;pos++)
		{
			System.out.println(teams[pos]);
		}
		
		//read by constrains:O(n)
		System.out.println("\nRead by condition");
		for(String tmp:teams)
		{
			if(tmp.startsWith("A"))
			{
				System.out.println(tmp);
			}
		}
		// O(n)
		System.out.println("\nRead by condition matches the phrase");
		for(String tmp:teams)
		{
			if(tmp.contains("ae")||tmp.contains("az")||tmp.contains("ac"))
			{
				System.out.println(tmp);
			}
		}
	}
}
