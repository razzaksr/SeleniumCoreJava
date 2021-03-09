package selenium.core.KishoreVinoth;

import java.util.Scanner;

public class Transactions 
{
	public static void main(String[] args) 
	{
		double start=12349.8,prev=0.0;
		Scanner scan=new Scanner(System.in);
		int count=0,amount=0;
		for(int begin=1;begin<=10;begin++)
		{
			System.out.println("Transaction amount: ");
			amount=scan.nextInt();
			if(amount<prev)
			{
				count++;
			}
			prev=amount;//copy
		}
		count-=3;
		System.out.println(start+" before considering charges");
		if(count>0)
		{
			start-=(count*20);
			System.out.println("Charges "+(count*20)+" will be debited from ur account");
		}
		System.out.println(start+" after charges applied");
		scan.close();
	}
}
