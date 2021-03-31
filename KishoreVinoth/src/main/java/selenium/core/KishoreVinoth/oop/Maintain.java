package selenium.core.KishoreVinoth.oop;

import java.util.Arrays;

/*
 * CRUDL:
 */

public class Maintain 
{
	Assembly[] tn=new Assembly[10];// array of assembly objects 
	public static void main(String[] args) 
	{
		Assembly a1=new Assembly("Salem North","Salem","Rajendran",new String[] {"Road","water"},32000,400000.4);
		Assembly a2=new Assembly("Salem East","Salem","KAnmani",new String[] {"Road","water"},92000,487890.4);
		Assembly a3=new Assembly("Mettur","Salem","Ravi",new String[] {"Road","eb"},220300,600000.4);
		Assembly a4=new Assembly("Salem South","Salem","Prbakaran",new String[] {"water","polution"},176534,800000.4);
		Maintain m=new Maintain();
		m.recordNewAssembly(a1);m.recordNewAssembly(a3);m.recordNewAssembly(a4);
		m.listRecords();
		m.search("water");
		m.search(50000);
	}
	
	public void recordNewAssembly(Assembly as)
	{
		for(int index=0;index<tn.length;index++)
		{
			if(tn[index]==null)
			{
				tn[index]=as;
				System.out.println(as.getName()+" are added to record");
				break;
			}
		}
	}
	
	public void search(int pop)
	{
		System.out.println("Finding assemblies which population is "+pop);
		for(Assembly tmp:tn)
		{
			if(tmp!=null&&tmp.getPopulation()>=pop)
				System.out.println(tmp);
		}
	}
	
	public void search(String issue)
	{
		System.out.println("Finding assemblies which has "+issue);
		for(Assembly tmp:tn)
		{
			if(tmp!=null&&(Arrays.toString(tmp.getIsues())).contains(issue))
				System.out.println(tmp);
		}
	}
	
	public void listRecords()
	{
		for(Assembly tmp:tn)
		{
			if(tmp!=null)
				System.out.println(tmp);
		}
	}
}
