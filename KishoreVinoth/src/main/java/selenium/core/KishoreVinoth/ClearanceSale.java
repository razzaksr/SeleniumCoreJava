package selenium.core.KishoreVinoth;

import java.util.Scanner;

public class ClearanceSale 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		
		int profit=0;
		
		// seller section
		System.out.println("Tell us mobile u wish to sell: ");
		String mobile=scan.nextLine();
		System.out.println("Tell us quantity of "+mobile+" available to kickstart ur sale: ");
		int qty=scan.nextInt();
		System.out.println("Tell us price worth of "+mobile);
		double cost=scan.nextDouble();
		System.out.println("Tell us no of days wish to process the sale: ");
		int days=scan.nextInt();
		
		
		// sale process
		System.out.println("---------------Sale Process-----------------");
		do
		{
			System.out.println("Tell us how many "+mobile+" u required? ");
			int expected=scan.nextInt();
			if(qty>=expected)
			{
				System.out.println("Payment process.... enter the amount: ");
				int amount=scan.nextInt();
				if(amount>=(expected*cost))
				{
					qty-=expected;
					profit+=(expected*cost);
					System.out.println(expected+" mobile "+mobile+" with amount of "+(expected*cost)+" has sold");
				}
				else
				{
					System.out.println("Payment failed");
				}
			}
			else
			{
				System.out.println(expected+" not available");
			}
			days--;
			cost-=(cost*0.074);
		}while(qty>0&&days>0);
		System.out.println("Our clearance sale profit is: "+profit);
		scan.close();
	}
}
