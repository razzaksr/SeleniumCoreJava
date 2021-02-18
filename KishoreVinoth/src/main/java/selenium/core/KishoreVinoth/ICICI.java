package selenium.core.KishoreVinoth;

import java.util.Scanner;

public class ICICI
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us account balance: "); 
		float accBal=scan.nextFloat();
		System.out.println("Number of debit transaction's done: ");
		int debit=scan.nextInt();
		int extra=debit-3;
		if(extra>0)
			accBal=accBal-(float)(extra*20);
		System.out.println("Available balance: "+accBal);
		scan.close();
	}
}
