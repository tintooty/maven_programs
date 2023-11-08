package abstractemployee;

import java.util.Scanner;

public class Contract extends Employee {
	
	public void calculateSalary(int payment)
	{
		Scanner scr = new Scanner(System.in);
		System.out.println("Hours Worked(Contract Emp)");
		hoursWorked = scr.nextInt();
		salary = payment * hoursWorked;
		System.out.println("Total Salary(Contract Employee)  :"+salary);
	}

	
}
