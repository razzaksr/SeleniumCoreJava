package selenium.core.KishoreVinoth;

import java.util.Scanner;

public class Cryption 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		// sender side
		System.out.println("Sender, tell us data: ");
		int data=scanner.nextInt();
		System.out.println("Sender, tell us key to encrypt: ");
		int key=scanner.nextInt();
		int crypted=data<<key;
		System.out.println("Data encrypted and sent to receiver");
		
		System.out.println("-----------Receiver received the data "+crypted+"---------");
		System.out.println("Receiver, tell us decrypt key: ");
		int bits=scanner.nextInt();
		int decrypt=crypted>>bits;
		System.out.println("Decryption done, data is "+decrypt);
		
		
		scanner.close();
	}
}
