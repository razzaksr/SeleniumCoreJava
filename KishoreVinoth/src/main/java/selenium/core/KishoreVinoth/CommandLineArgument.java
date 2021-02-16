package selenium.core.KishoreVinoth;

public class CommandLineArgument 
{
	public static void main(String[] kishore) 
	{
		String role=kishore[0];
		Short experience=Short.parseShort(kishore[1]);
		String curOrg=kishore[2];
		Float curCtc=Float.parseFloat(kishore[3]);
		String preLocation=kishore[4];
		System.out.println("Zealous Tech Corp");
		System.out.println("Review your submission");
		System.out.println("Role: "+role);// Role: Java Lead
		System.out.println("Experience: "+experience);
		System.out.println("Current Organisation: "+curOrg);
		System.out.println("Current CTC: "+curCtc);
		System.out.println("Preferred location to work: "+preLocation);
	}
}
