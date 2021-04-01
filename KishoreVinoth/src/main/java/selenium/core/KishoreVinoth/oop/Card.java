package selenium.core.KishoreVinoth.oop;

public class Card extends Account
{
	private long cardNum;private int cvv;
	public long getCardNum() {
		return cardNum;
	}
	public void setCardNum(long cardNum) {
		this.cardNum = cardNum;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public void deposit(int amount)
	{
		setBalance(getBalance()+amount);
		System.out.println(amount+" deposited with "+getHolderNumber());
	}
	public Card() {System.out.println("Card's default constructor");}
	public static void main(String[] args) 
	{
		Card c=new Card();
		c.setCardNum(9876567897678L);
		c.setCvv(123);
		c.setBalance(86734.34);c.setHolderName("Mohamed");c.setHolderNumber(8765678765676L);
		c.deposit(20000);
		System.out.println(c);
	}
}
