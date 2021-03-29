package selenium.core.KishoreVinoth.oop;

import selenium.core.KishoreVinoth.oop.Alpha.Master;

public class InnerNonStatic 
{
	public static void main(String[] args) 
	{
		Alpha alpha=new Alpha();
		alpha.list();
		Master mas=alpha.new Master();
		mas.info();
		mas.reach(4);
	}
}


class Alpha
{
	String[] myTeam= {"Free fire","Whatsapp","Youtube","Facebook","Opera"};
	public void list()
	{
		for(String tmp:myTeam) {System.out.println(tmp);}
	}
	class Master
	{
		public void info()
		{
			System.out.println("Non static block of non static inner class Master");
		}
		public void reach(int index)
		{
			System.out.println(myTeam[index]);
		}
	}
}