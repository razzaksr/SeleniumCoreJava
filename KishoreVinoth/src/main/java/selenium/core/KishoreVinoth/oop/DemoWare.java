package selenium.core.KishoreVinoth.oop;

public class DemoWare 
{
	public static void main(String[] args) 
	{
		Warehouse house=new Warehouse();
		System.out.println(house.rpm.length);
		house.listOut();
		System.out.println(house.search(1200.455));
		house.update(8.1);
		house.listOut();
	}
}
