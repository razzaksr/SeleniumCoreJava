package selenium.core.KishoreVinoth;

/*
 * Unary: ++ --
 * pre: OPRvar	>> changes can get same spot
 * post: varOPR	>> changes can get next spot
 * 
 */

public class UnaryOperator 
{
	public static void main(String[] args) 
	{
		char peter=98, roggers='R';
		System.out.println(peter+" "+roggers);
		System.out.println(peter++ +" "+ --roggers);
		System.out.println(peter+" "+roggers);
		System.out.println(++peter +" "+ roggers--);
		System.out.println(peter+" "+ --roggers);
	}
}
