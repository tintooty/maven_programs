package superclass.examples;

public class SuperExampleClassA {
	
	int number1 =2;
	int number2 =3;
	
	public void print(int num1,int num2)
	{
		int sum1 = this.number1+num1;
		int sum2 = this.number2+num2;
		System.out.println("Sum1 : "+sum1);
		System.out.println("Sum2 : "+sum2);
		
	}

}
