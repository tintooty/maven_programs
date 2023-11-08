package encapsulation.bankpin;

import java.util.Scanner;

public class User {

	
	public static void main(String[] str)
	{
		int pin;
		Bank bankObj = new Bank();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the pin:");
		pin = scr.nextInt();
		bankObj.setPin(pin);
		bankObj.getPin();
		
	
	}

}
