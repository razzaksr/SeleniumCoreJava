package selenium.core.KishoreVinoth.exceptions;

import java.io.IOException;

public class ThrowDemo 
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		Runtime run=Runtime.getRuntime();
		Process pro=null;
		pro=run.exec("mspaint");
		Thread.sleep(5000);
		pro.destroy();
		Thread.sleep(5000);
		pro=run.exec("calc");
		Thread.sleep(5000);
		pro.destroy();
		Thread.sleep(5000);
		pro=run.exec("notepad");
		Thread.sleep(5000);
		pro.destroy();
	}
}
