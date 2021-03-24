package selenium.core.KishoreVinoth.oop;

public class InnerAsStatic 
{
	public static void main(String[] args) 
	{
		System.out.println(BaseLine.totalCredits);
		BaseLine base=new BaseLine();
		base.list();
		BaseLine.Hey.check();
		BaseLine.Hey h=new BaseLine.Hey();
		h.find();
		System.out.println("Total deposition "+BaseLine.totalCredits);
	}
}

class BaseLine
{
	static Integer[] transactions= {1000,3000,1200,450,100,50,10,400,1000,300};
	
	public void list()
	{
		for(Integer tmp:transactions)
		{
			System.out.println(tmp);
		}
	}
	
	static int totalCredits;
	
	static class Hey
	{
		public static void check()
		{
			System.out.println("Calling static method of static inner class");
		}
		public void find()
		{
			for(int current=1;current<transactions.length;current++)
			{
				if(transactions[current]>transactions[current-1])
				{
					totalCredits+=transactions[current];
				}
			}
		}
	}
}