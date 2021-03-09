package selenium.core.KishoreVinoth;

import java.util.Scanner;

public class Nesteds 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("No of shows: ");
		int daily=scan.nextInt();
		for(int show=1;show<=daily;show++)
		{
			System.out.println("Tell us ticket issuing time for "+show+": ");
			double time=scan.nextDouble();
			double end=time+1.00;
			int available=40;
			while(time<=end&&available>0)
			{
				System.out.println("How many ticket you need: ");
				int count=scan.nextInt();
				if(count<=available)
				{
					System.out.println("Enter the ticket amount: ");
					int amount=scan.nextInt();
					if(amount>=(120*count))
					{
						System.out.println("Ticket booked for the show: "+show+" time is "+time);
						available-=count;
					}
					else
					{
						System.out.println("Insufficient amount to watch");
					}
				}
				else
				{
					System.out.println("We have only "+available);
				}
				time+=0.01;
			}
		}
		scan.close();
	}
}
