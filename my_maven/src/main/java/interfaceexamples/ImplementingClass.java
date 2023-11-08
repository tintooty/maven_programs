package interfaceexamples;

public class ImplementingClass implements InterfaceSample3 {
	
	public void welcomeClass()
	{
		System.out.println("Implementing Class" +MAX_VALUE);
	}

	public void welcome() 
	{
		
		System.out.println("Interface Method" + MAX_VALUE);
	}
	
	public void display() 
	{
		System.out.println("Interface method displaying constant"+ MAX_VALUE);
		
	}
	
	public void displayNumber()
	{
		System.out.println("Interface 3 method implemented "+MAX_NUMBER);
	}
	
	public void add(int number1, int number2) {
		int sum = number1 + number2 + MAX_VALUE;
		System.out.println("Sum is "+sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingClass obj = new ImplementingClass();
		obj.welcome();
		obj.welcomeClass();
		obj.display();
		obj.add(20,30);
		obj.displayNumber();
	}
}
