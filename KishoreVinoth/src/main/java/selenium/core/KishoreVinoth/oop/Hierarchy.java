package selenium.core.KishoreVinoth.oop;

import java.util.Scanner;

public class Hierarchy 
{
	public static void main(String[] args) 
	{
		ATM a=new ATM();
		a.setHolderName("Vinoth");a.setBalance(23700.7);
		a.setHolderNumber(876545678L);a.setPin(1122);
		
		System.out.println(a);
		a.withdraw(3000);
		
		Netbank net=new Netbank();
		net.setBalance(2000.8);net.setHolderName("Mohamed");net.setHolderNumber(87656789L);
		net.setTransPwd("razakMohamed");
		
		System.out.println(net);
		net.pay("EB", 3900);
		
//		//factory pattern
//		Account acc=new ATM();
//		acc.setBalance(8765.768);acc.setHolderName("Razak");acc.setHolderNumber(876789L);
//		System.out.println(acc);
	}
}

class ATM extends Account// single
{
	public ATM() {System.out.println("ATM Constructor");}
	private int pin;
	Scanner scan=new Scanner(System.in);

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void withdraw(int amount)
	{
		if(amount<=getBalance())
		{
			System.out.println("Enter the pin to proceed");
			int PIN=scan.nextInt();
			if(PIN==this.pin)
			{
				setBalance(getBalance()-amount);
				System.out.println(amount+" debited");
				System.out.println(this);
			}
			else
			{
				System.out.println("Wrong pin");
			}
		}
		else
		{
			System.out.println("Insufficient amount");
		}
	}
	
}
class Netbank extends Account
{
	Scanner scan=new Scanner(System.in);
	private String transPwd;

	public String getTransPwd() {
		return transPwd;
	}

	public void setTransPwd(String transPwd) {
		this.transPwd = transPwd;
	}
	
	public void pay(String type, int bill)
	{
		if(bill<=getBalance())
		{
			System.out.println("Enter the password to proceed");
			String pwd=scan.next();
			if(pwd.equals(this.transPwd))
			{
				setBalance(getBalance()-bill);
				System.out.println(bill+" paid to "+type);
				System.out.println(this);
			}
			else
			{
				System.out.println("Wrong password");
			}
		}
		else
		{
			System.out.println("Insufficient amount");
		}
	}
}