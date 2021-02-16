package selenium.core.KishoreVinoth;

public class Parsing 
{
	public static void main(String[] args) 
	{
		String cupcake="112", froyo="89.5", gingerbread="false", kitkat="9876544567";
		System.out.println(cupcake+2);
		int entry=Integer.parseInt(cupcake);
		float weight=Float.parseFloat(froyo);
		boolean loss=Boolean.parseBoolean(gingerbread);
		long contact=Long.parseLong(kitkat);
		System.out.println("Review of Contestant's Information");
		System.out.println("Entry number: "+entry);
		System.out.println("Weight of class: "+weight);
		System.out.println("Has previous lose: "+loss);
		System.out.println("Contact: "+contact);
		
		entry=entry+4;
		
		System.out.println("Impact after zone level league rank is:"+entry);
	}
}
