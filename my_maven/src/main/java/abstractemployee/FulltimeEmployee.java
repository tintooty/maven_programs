package abstractemployee;

import java.util.Scanner;

public class FulltimeEmployee extends Employee{

	final int WORK_HOUR =8;
	
	public void calculateSalary(int payment) {
		salary = payment * WORK_HOUR;
		System.out.println("Total Salary(Fulltime Employee) :"+salary);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the payment for full time employee : ");
		int fultimePayment = scr.nextInt();
		FulltimeEmployee emp = new FulltimeEmployee();
		emp.calculateSalary(fultimePayment);
		
		System.out.println("Enter the payment for contract employee : ");
		int contractPayment = scr.nextInt();
		Contract con = new  Contract();
		con.calculateSalary(contractPayment);

	}

	

}
