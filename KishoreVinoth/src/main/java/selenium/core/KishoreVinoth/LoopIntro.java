package selenium.core.KishoreVinoth;

import java.util.Scanner;

/*
 * Looping statements:

repetation
to reduce time complexity

start>> initialization
step up>> iteration
end>>condition


4 types:

//init
while(cond)
{
// repeation statements
// iter
}


for(init;cond;iter)
{
// repeation
}

//foreach
for(type local:source	)
{

}

//init
do
{
//repeation
//iter
}while(cond);


continue>> skip
break>> come out
 */

public class LoopIntro 
{
	public static void main(String[] args) 
	{
		// Theatre ticket booking
		Scanner scan=new Scanner(System.in);
		double time=12.30;int available=40;
		while(time<=13.31&&available>0)
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
		}
		scan.close();
	}
}
