package selenium.core.KishoreVinoth.oop;

import java.util.Scanner;

public class Multilevel extends ATM
{
	Multilevel recipient;
	Scanner scan=new Scanner(System.in);
	public void cardToCard(int amount)
	{
		System.out.println("Enter pin:"+getHolderName());
		int tmp=scan.nextInt();
		if(tmp==getPin())
		{
			if(amount<=getBalance())
			{
				setBalance(getBalance()-amount);
				recipient.setBalance(recipient.getBalance()+amount);
				System.out.println(recipient.getHolderName()+" got credited amount of "+amount);
				System.out.println(this);
				System.out.println(this.recipient);
			}
			else
			{
				System.out.println("Insufficient");
			}
		}
		else {System.out.println("Wrong pin");}
	}
	public static void main(String[] args) 
	{
		Multilevel mul1=new Multilevel();
		mul1.setBalance(7860.8);mul1.setHolderName("Razak");mul1.setHolderNumber(876545678L);
		mul1.setPin(7766);
		
		mul1.recipient=new Multilevel();
		mul1.recipient.setBalance(7600.9);mul1.recipient.setHolderName("Vinoth");
		mul1.recipient.setHolderNumber(987654567L);mul1.recipient.setPin(8877);
		
		mul1.cardToCard(6700);
	}
}
