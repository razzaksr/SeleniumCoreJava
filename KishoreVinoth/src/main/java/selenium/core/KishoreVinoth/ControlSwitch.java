package selenium.core.KishoreVinoth;

import java.util.Scanner;

public class ControlSwitch
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
			case "steel":System.out.println("Starts with 6200RS");break;
			case "plastic":System.out.println("Starts with 3000Rs");break;
			case "glass": System.out.println("Starts with 15000Rs");break;
			default: System.out.println(material+" Not available here");
		}
		scan.close();
	}
}