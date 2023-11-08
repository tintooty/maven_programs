package encapsulation.bankpin;
public class Bank {
	
	private int pin;
	
	public void setPin(int pin)
	{
		this.pin = pin;
	}

	public void getPin() {
		boolean flag = validatePin();
		if(flag==true)
		{
			System.out.println("Valid pin :"+pin);
		}
		else
		{
			System.out.println("Enter valid pin");
		}
	}

	
	public boolean validatePin()
	{
		if(pin == 1111 || pin == 1212 || pin ==1234)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
