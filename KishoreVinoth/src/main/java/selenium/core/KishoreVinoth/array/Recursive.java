package selenium.core.KishoreVinoth.array;

public class Recursive 
{
	public void even(int wet)
	{
		if(wet<=10)
		{
			System.out.println("Even called "+wet);
			even(wet+1);
		}
		else{return;}
		
	}
	public static void main(String[] args) 
	{
		for(int num=2;num<=100;num+=2)
		{
			System.out.println(num);
		}
		Recursive rec=new Recursive();
		rec.even(6);
	}
}
