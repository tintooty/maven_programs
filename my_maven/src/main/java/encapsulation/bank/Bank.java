package encapsulation.bank;

public class Bank {

	private float balance;
	private String name;
	
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void calcuate(int deposite)
	{
			balance = balance+deposite;
	}
	
	
}
