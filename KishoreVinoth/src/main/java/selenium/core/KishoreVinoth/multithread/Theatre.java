package selenium.core.KishoreVinoth.multithread;

import java.util.Scanner;

public class Theatre 
{
	public static void main(String[] args) 
	{
		Screen sc=new Screen();
		Thread t1=new Thread(sc,"Riyaz");
		Thread t2=new Thread(sc,"Karthik");
		Thread t3=new Thread(sc,"Sasi");
		Thread t4=new Thread(sc,"Aravind");
		t1.start();t2.start();t3.start();t4.start();
		//System.out.println(sc.totalCollection+" collected for the show");
	}
}


class Screen implements Runnable
{
	Scanner scan=new Scanner(System.in);
	int seat=20,totalCollection=0;
	@Override
	synchronized public void run()
	{
		String name=Thread.currentThread().getName();
		System.out.println("TEll us how many tickets you wish "+name);
		int count=scan.nextInt();
		if(count<=seat)
		{
			int yetToPay=(count*120);
			System.out.println("Enter the amount: "+name);
			int cost=scan.nextInt();
			if(cost>=yetToPay)
			{
				seat-=count;
				totalCollection+=yetToPay;
				if(cost>yetToPay)
				{
					System.out.println(name+" please wait to get your balance "+ (cost-yetToPay) +" back");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println(count+" ticket(s) has booked by "+name);
			}
			else
			{
				System.out.println("Insufficient amount to watch movie "+name);
			}
		}
		else
		{
			System.out.println("This show is Housefull "+name);
			Thread.currentThread().stop();
		}
		System.out.println(totalCollection+" collected for the show");
	}
}
