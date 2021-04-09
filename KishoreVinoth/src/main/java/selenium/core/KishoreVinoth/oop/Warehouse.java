package selenium.core.KishoreVinoth.oop;

public class Warehouse 
{
	double[] rpm= {1200.4, 1000.4,4000.5,1200.455,400.2};// default
	public void listOut()
	{
		for(double tmp:rpm) {System.out.println(tmp);}
	}
	protected int search(double data)
	{
		for(int index=0;index<rpm.length;index++)
		{
			if(rpm[index]==data)
				return index;
		}
		return -1;
	}
	final public void update(double per)
	{
		for(int index=0;index<rpm.length;index++)
		{
			rpm[index]+=(rpm[index]*per)/100;
		}
	}
}
