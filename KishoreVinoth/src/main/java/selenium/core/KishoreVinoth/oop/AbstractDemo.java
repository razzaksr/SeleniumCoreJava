package selenium.core.KishoreVinoth.oop;

import java.util.Arrays;

public class AbstractDemo extends Energy
{
	int count=0;
	public static void main(String[] args) 
	{
		//Energy e=new AbstractDemo();
		AbstractDemo e=new AbstractDemo();
		e.countNot100s();
		System.out.println(e.count);
	}

	@Override
	public void countNot100s() {
		// TODO Auto-generated method stub
		for(short[] row:str)
		{
			int calc=row[0]+row[1];
			if(calc<100)
				count++;
		}
	}

}
// here we can have both abstract and non abstract method
// it will insist us to override method when inheritance happens, normal class doesn't
// cannot instantiate/object creation not possible here, rather inheritance is okay
abstract class Energy
{
	short[][] str= {{90,10},{10,70},{20,80},{60,10},{10,90},{24,86},{90,11},{21,87}};
	public void list()
	{
		for(short[] row:str)
		{
			System.out.println(Arrays.toString(row));
		}
	}
	public abstract void countNot100s();
}