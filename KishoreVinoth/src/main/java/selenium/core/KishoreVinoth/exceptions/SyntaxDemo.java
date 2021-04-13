package selenium.core.KishoreVinoth.exceptions;

public class SyntaxDemo 
{
	static Integer[] hai;
	public static void main(String[] args) 
	{
		try
		{
			for(Integer tmp:hai)
			{
				System.out.println(tmp);
			}
		}
		catch(NullPointerException ne)
		{
			System.out.println(ne);
			//hai=new Integer[10];// initialize
			hai=new Integer[]{12,45,67,8};// initialize
			for(Integer tmp:hai)
			{
				System.out.println(tmp);
			}
		}
		finally
		{
			System.out.println("Extraction done");
		}
	}
}
