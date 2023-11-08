package superclass.examples;

public class SuperExampleClassB extends SuperExampleClassA {
	
	int number1=50;
	int number2=100;
	
	public void sum(int number1,int number2)
	{
		super.number1 = super.number1+10;
		this.number2 = this.number2+30;
		System.out.println("Super : "+super.number1);
		System.out.println("this : "+this.number2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SuperExampleClassB obj = new SuperExampleClassB();
		obj.sum(20,30);
		obj.print(10, 10);

	}

}
