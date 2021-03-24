package selenium.core.KishoreVinoth.oop;

public class GenericClass 
{
	double charges;int count;
	Integer[] transactions= {1000,3000,1200,450,100,50,10,400,1000,300};
	public void calculate()
	{
		for(int current=1;current<transactions.length;current++)
		{
			if(transactions[current]<transactions[current-1])
			{
				count++;
			}
		}
		count-=3;
		charges=count*20;
		System.out.println("Charges is "+charges+" for "+count+" extra debits");
	}
	public static void main(String[] args) 
	{
		GenericClass gen=new GenericClass();
		gen.calculate();
	}
}
