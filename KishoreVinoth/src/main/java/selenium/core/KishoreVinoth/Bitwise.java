package selenium.core.KishoreVinoth;

/*
 * Bitwise: & | ^ >> <<
 * 
 * eg: 40
 * 2048 1024 512 256 128 64 32 16 8 4 2 1
 * 0    0    0   0   0   0  1  0  1 0 0 0  >> 40
 * 0    0    0   0   0   0  0  1  0 0 1 0  >> 18>> oreo
 * 0    0    0   0   0   1  0  0  1 0 1 1  >> 75>> steve
 * 0    0    0   0   0   1  0  0  1 0 0 1  >> 73>> tony
 * 0    0    0   0   0   1  0  0  1 0 1 1  >> 75
 * 0    0	 0   0   0   0  0  0  0 0 1 0  >> 2
 * 
 */

public class Bitwise 
{
	public static void main(String[] args) 
	{
		short oreo=18;char tony='I'; byte steve=75;
		System.out.println(oreo&steve);
		System.out.println((int)tony);
		System.out.println(tony|steve);
		System.out.println(oreo^(tony&steve));
	}
}
