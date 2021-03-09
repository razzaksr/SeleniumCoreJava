package selenium.core.KishoreVinoth;

import java.util.Scanner;

public class DoWhile 
{
	public static void main(String[] args) 
	{
		// Theatre ticket booking
		Scanner scan=new Scanner(System.in);
		double time=12.30;int available=0;
		do
		{
			System.out.println("How many ticket you need: ");
			int count=scan.nextInt();
			if(count<=available)
			{
				System.out.println("Enter the ticket amount: ");
				int amount=scan.nextInt();
				if(amount>=(120*count))
				{
					System.out.println("Ticket will be booked");
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
		}while(time<=13.31&&available>0);
		scan.close();
	}
}
