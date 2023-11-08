package polymorphism.season;

import java.util.Scanner;

public class Offseason extends Onseason{
	
	Scanner scr = new Scanner(System.in);
	
	public void discount(float amount)
	{
		discount = amount * (15f/100f);
		amount = amount-discount;
		System.out.println("Total bill amount after discount : "+amount);
	}

	public void userInput()
	{

		System.out.println("Enter the total price");
		int totalPrice = scr.nextInt();
		System.out.println("Enter the season");
		System.out.println("Press 1 : OffSeason");
		System.out.println("Press 2 : OnSeason");
		int choice = scr.nextInt();
		switch(choice)
		{
		case 1: 
			discount(totalPrice);
			break;
		case 2:
			super.discount(totalPrice);
			break;
		default:
				System.out.println("Enter a valid season");
		}
		
	}
	
	public static void main(String[] str)
	{
		
		Offseason obj = new Offseason();
		obj.userInput();

	}
}
