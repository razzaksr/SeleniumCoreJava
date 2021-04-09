package selenium.core.KishoreVinoth;

import selenium.core.KishoreVinoth.oop.Warehouse;

public class VerifyWare extends Warehouse
{
	public static void main(String[] args) 
	{
		VerifyWare ware=new VerifyWare();
		//System.out.println(ware.rpm.length);
		ware.listOut();
		System.out.println(ware.search(4000.5));
		ware.update(12.5);
		ware.listOut();
	}
}
