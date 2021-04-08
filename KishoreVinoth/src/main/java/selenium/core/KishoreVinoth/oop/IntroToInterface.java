package selenium.core.KishoreVinoth.oop;

import java.util.Arrays;

public class IntroToInterface extends Web implements Hai// multiple inheritance
{
	int total;
	public static void main(String[] args) 
	{
		/*
		 * Web w=new Web(); w.count=4000; w.find();
		 */
		IntroToInterface w=new IntroToInterface();
		w.count=6000;w.find();
		Hai h=new IntroToInterface();
		System.out.println(Arrays.toString(h.transact));
		h.findSum();
		/*
		 * System.out.println(Arrays.toString(w.transact)); w.findSum();
		 */
	}

	@Override
	public void findSum() 
	{
		// TODO Auto-generated method stub
		for(int index=1;index<transact.length;index++)
		{
			if(transact[index]<transact[index-1])
			{
				total+=transact[index];
			}
		}
		System.out.println("Total value is "+total);
	}
}

// class members no need to initialize
// class contains only non-abstract method
// class can be instantiated/object creation by its own constructor or inherite
// while inheritance overriding is not mandate
// class members value can be updated whereas interface remains constant
class Web
{
	int count;
	double[] income= {1200.5,7800.4,789.3,1299.4,765.2,4399.8};
	public void find()
	{
		for(double tmp:income)
		{
			if(tmp>=count)
				System.out.println(tmp);
		}
	}
}

interface Hai
{
	int sum=0;
	int[] transact= {98700,6540,1200,500,1000,4500,1399};
	public void findSum();// abstract method
}