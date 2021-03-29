package selenium.core.KishoreVinoth.oop;

public class Anonymous 
{
	public static void main(String[] args) 
	{
		/*
		 * Wallet wall=new Wallet(); System.out.println(wall.balance);
		 * wall.transfer(2000); wall.rewards(10); System.out.println(wall.balance);
		 */
		new Wallet().rewards(20);// anonymous
		System.out.println(new Wallet().balance);
	}
}
class Wallet
{
	double balance=10000.89;
	public void transfer(int amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			System.out.println(amount+" has transferred successfully");
		}
		else
		{
			System.out.println("Insufficient");
		}
	}
	public void rewards(int amt)
	{
		balance+=amt;
		System.out.println("reward "+amt+" added");
	}
}