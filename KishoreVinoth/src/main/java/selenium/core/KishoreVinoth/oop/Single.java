package selenium.core.KishoreVinoth.oop;

public class Single extends Account
{
	public void heyThere()
	{
		System.out.println("Single class method");
	}
	public static void main(String[] args) 
	{
		Single s=new Single();
		s.heyThere();
		//Account a=new Account();
		s.setBalance(7690.4);
		s.setHolderName("Vinoth");
		s.setHolderNumber(876556789L);
		System.out.println(s);
	}
}
