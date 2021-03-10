package selenium.core.KishoreVinoth;

import java.util.Scanner;

public class NestedInReal 
{
	public static void main(String[] args) 
	{
		Scanner sca=new Scanner(System.in);
		// Interview process
		int raja=0,vinoth=0,vikas=0,vinay=0,vishnu=0;
		for(int rounds=99;rounds<=102;rounds++)
		{
			for(int res=1;res<=5;res++)
			{
				System.out.println("Tell us score of round "+rounds);
				if(res==1)
					raja+=sca.nextInt();
				else if(res==2)
					vinoth+=sca.nextInt();
				else if(res==3)
					vikas+=sca.nextInt();
				else if(res==4)
					vinay+=sca.nextInt();
				else
					vishnu+=sca.nextInt();
			}
			System.out.println("End of round "+rounds+" score summary is.......... ");
			System.out.println("Raja: "+raja);
			System.out.println("Vinoth: "+vinoth);
			System.out.println("Vikas: "+vikas);
			System.out.println("Vinay: "+vinay);
			System.out.println("Vishnu: "+vishnu);
		}
		sca.close();
	}
}
