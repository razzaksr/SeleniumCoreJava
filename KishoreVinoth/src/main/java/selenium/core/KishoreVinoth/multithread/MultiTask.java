package selenium.core.KishoreVinoth.multithread;

import java.util.Scanner;

public class MultiTask 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Machine1 m1=new Machine1();
		Machine2 m2=new Machine2();
		Thread t1=new Thread(m1,"Promoth");
		Thread t2=new Thread(m2,"Vishnu");
		Thread t3=new Thread(m1,"Ajay");
		Thread t4=new Thread(m2,"Vikas");
		t1.start();//t1.join();
		t2.start();//t2.join();
		t3.start();t4.start();
	}
}

class Machine1 implements Runnable
{
	int macBalance=45000;
	Scanner scan=new Scanner(System.in);
	@Override
	public void run() 
	{
		System.out.println("Tell us no of person: "+Thread.currentThread().getName());
		synchronized (scan) 
		{
			int persons=scan.nextInt();
			if(macBalance>=(persons*2000))
			{
				macBalance-=(persons*2000);
				System.out.println("These set of "+persons+" can debit their money");
			}
			else
			{
				System.out.println(persons+" no people can't withdraw");
			}
			System.out.println("Available in "+macBalance);
		}
	}	
}

class Machine2 implements Runnable
{
	int depAmt=100000;
	Scanner scan=new Scanner(System.in);
	@Override
	public void run() 
	{
		System.out.println(Thread.currentThread().getName()+" tell us amount to deposit");
		int amt=scan.nextInt();
		if(amt%500==0 || amt%2000==0 || amt%100==0)
		{
			depAmt+=amt;
			System.out.println("Cash "+amt+" deposited");
		}
		else
		{
			System.out.println("Invalid denominations");
		}
	}
}