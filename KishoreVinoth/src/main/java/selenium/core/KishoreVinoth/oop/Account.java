package selenium.core.KishoreVinoth.oop;

public class Account 
{
	private String holderName;
	private long holderNumber;
	private double balance;
	public Account() {
		System.out.println("Account's default constructor");
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Account [holderName=" + holderName + ", holderNumber=" + holderNumber + ", balance=" + balance + "]";
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public long getHolderNumber() {
		return holderNumber;
	}
	public void setHolderNumber(long holderNumber) {
		this.holderNumber = holderNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
