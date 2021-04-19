package selenium.core.KishoreVinoth.multithread;

import java.util.Scanner;

public class ThreadImplementation 
{
	public static void main(String[] args) throws InterruptedException 
	{
		Alpha alpha=new Alpha();
		//System.out.println(alpha.getOne(4));
		Thread t1=new Thread(alpha,"Balaji");
		Thread t2=new Thread(alpha,"Vinoth");
		Thread t3=new Thread(alpha,"Arun");
		Thread t4=new Thread(alpha,"Vikas");
		//t1.start();t1.join();t2.start();t2.join();t3.start();t3.join();t4.start();
		//t1.run();t2.run();t3.run();t4.run();
		t1.start();t2.start();t3.start();t4.start();
	}
}
class Alpha implements Runnable//extends Thread
{
	private Scanner scan=new Scanner(System.in);
	private String[] best= {"Asuran","Othaserupu","Sooraraipotru","Karnan","Vadachennai","Thondan"};
	public String getOne(int index)
	{
		return best[index-1];
	}
	synchronized public void run()
	{
		System.out.println("Tell us index Mr/MS "+Thread.currentThread().getName()+" id is "+
	Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName()+" accessed "+getOne(scan.nextInt()));
	}
}