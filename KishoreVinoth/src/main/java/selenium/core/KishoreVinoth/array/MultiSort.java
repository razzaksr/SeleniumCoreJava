package selenium.core.KishoreVinoth.array;

public class MultiSort 
{
	public static void bubble(String[][] yet)
	{
		String third="";
		for(int row=0;row<yet.length;row++)// row
		{
			for(int times=0;times<yet[row].length-1;times++)
			{
				for(int bub=0;bub<yet[row].length-times-1;bub++)
				{
					if(yet[row][bub].compareTo(yet[row][bub+1])>0)
					{
						third=yet[row][bub];
						yet[row][bub]=yet[row][bub+1];
						yet[row][bub+1]=third;
					}
				}
			}
		}
	}
	public static void traverse(String[][] wet)
	{
		for(String[] row:wet)
		{
			for(String col:row)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		//jagged
		String[][] teams= {
				{"razak","Balaji"},
				{"sekar","Sabari","Ragu","Mani"},
				{"Nathan","Mohamed","Sheik"}};
		
		MultiSort.traverse(teams);
		MultiSort.bubble(teams);
		MultiSort.traverse(teams);
	}
}
