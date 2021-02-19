package selenium.core.KishoreVinoth;

/*
 * Short hand: += -= *= /= >>= <<= &= |= 
 * alpha+=beta>> alpha=alpha+beta
 */

public class ShortHand 
{
	public static void main(String[] args) 
	{
		double kishore=4.5, vinoth=9.5;
		//System.out.println("Kishore salary: "+kishore+" Vinoth salary: "+vinoth);
		// swap by third storage
		/*
		 * double third=kishore; kishore=vinoth; vinoth=third;
		 */
		/*
		 * //swap by + - kishore+=vinoth;// 14.0 vinoth=kishore-vinoth;// 4.5
		 * kishore-=vinoth;// 9.5
		 */
		/*
		 * // swap by * / kishore*=vinoth; vinoth=kishore/vinoth; kishore/=vinoth;
		 */
		int krish=(int)kishore, vin=(int)vinoth;
		System.out.println("Kishore salary: "+krish+" LPA, Vinoth salary: "+vin+" LPA");
		// swap by xor(^)
		krish^=vin;
		vin^=krish;// vin=vin^krish;// vin=krish^vin;
		krish^=vin;
		System.out.println("Kishore salary: "+krish+" LPA, Vinoth salary: "+vin+" LPA");
	}
}
