package selenium.core.KishoreVinoth;

import java.util.Scanner;

public class NestedPatterns 
{
	public static void main(String[] args) 
	{
		//left upper floyd
		for(int row=1;row<=5;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("@");
			}
			System.out.println();
		}
		
		// right upper floyd
		for(int row=1;row<=5;row++)
		{
			for(int space=5-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int data=1;data<=row;data++)
			{
				System.out.print("@ ");
			}
			System.out.println();
		}
		
		//pyramid
		Scanner scan=new Scanner(System.in);
		System.out.println("Tell us how many row you want: ");
		int maxRow=scan.nextInt();
		int limit=1;
		for(int row=1;row<=maxRow;row++)
		{
			for(int space=maxRow-1;space>=row;space--)
			{
				System.out.print(" ");
			}
			for(int data=1;data<=limit;data++)
			{
				System.out.print("@");
			}
			System.out.println();
			limit+=2;
		}
		scan.close();
	}
}
