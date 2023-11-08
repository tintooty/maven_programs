package rbi;

import java.util.Scanner;

public class HdfcClass implements RBIInterface{
	
	int matureAmount;
	
	public void recurringDeposite(int amount, int duration) {
		// TODO Auto-generated method stub
		 matureAmount = amount+((amount*duration*INTEREST_RATE)/100);
		 System.out.println("Maturity Amount : "+matureAmount);
	}
	
	public static void main(String[] args) 
	{
		HdfcClass hdfc = new HdfcClass();
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the amount deposited");
		int deposite = scr.nextInt();
		System.out.println("Enter the deposite period");
		int time = scr.nextInt();	
		hdfc.recurringDeposite(deposite, time);
	}
}
