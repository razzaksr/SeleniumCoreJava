package selenium.core.KishoreVinoth.array;

public class Create 
{
	public static void main(String[] args) 
	{
		int[] alpha= {12,45,33,21,67,87,1,3,91};
		System.out.println(alpha.length);
		
		//listing
		
		for(int index=3;index<alpha.length-1;index++) 
		{
			System.out.println(alpha[index]);// read 
		}
		 
		
		
		//listing
		for(int hai:alpha)
		{
			System.out.println(hai);
		}
		
	}
}
