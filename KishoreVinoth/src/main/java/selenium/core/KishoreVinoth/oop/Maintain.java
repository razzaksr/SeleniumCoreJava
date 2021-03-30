package selenium.core.KishoreVinoth.oop;

import java.util.Arrays;

public class Maintain 
{
	public static void main(String[] args) 
	{
		Assembly a=new Assembly();
		//a.setDistrict("Salem");
		a.hai="Zealous";
		System.out.println(a.hai);
		System.out.println(a.getDistrict());
		a.setDevAmt(3000000.9);
		a.setPopulation(320000);
		a.setName("Salem North");
		a.setIsues(new String[]{"road","water","polution"});
		a.setSittingMLA("Rajendran");
		
		//System.out.println(a.getName()+" "+a.getDistrict()+" "+Arrays.toString(a.getIsues())+" "+a.getDevAmt()+" "+a.getSittingMLA()+" "+a.getPopulation());
		System.out.println(a);
		
		Assembly b=new Assembly("Salem South", "SAlem", "Parthiban", new String[] {"water","population"}, 29000,1230000.9 );
		System.out.println(b.getPopulation()+" "+b.getDistrict());
		
	}
}
