package selenium.core.KishoreVinoth;

import java.util.Scanner;

public class ControlIF 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("----------------ABC Furnitures------------");
		System.out.println("Tell us kind of material you required? ");
		String material=scan.nextLine();
		material=material.toLowerCase();
		switch(material)
		{
			case "compressed":System.out.println("Starts with 4500Rs");break;
			case "mica":case "plywood":System.out.println("Starts with 6000Rs");break;
			case "steel":System.out.println("Starts with 6200RS");
			System.out.println("Tell us your budget: ");
			Short budget=scan.nextShort();
			if(budget>=6200&&budget<8000)
			{
				System.out.println("4X2 feet");
			}
			else if(budget>=8000&&budget<15000)
			{
				System.out.println("4X4 feet and 4X5");
			}
			else if(budget>=15000&&budget<21000)
			{
				System.out.println("5x5, 4X6, 6X5 feet");
			}
			else
			{
				System.out.println("Not available");
			}
			break;
			case "plastic":System.out.println("Starts with 3000Rs");break;
			case "glass": System.out.println("Starts with 15000Rs");break;
			default: System.out.println(material+" Not available here");
		}
		scan.close();
	}
}
