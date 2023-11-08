package polymorphism.season;

public class Onseason {
	
	float discount;
	
	
	public void discount(float amount)
	{
		discount = amount * (40f/100f);
		amount = amount-discount;
		System.out.println("Total bill amount after discount  : "+amount);
	}

}
