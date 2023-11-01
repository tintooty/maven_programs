package abstractsample;

public class SampleClass extends AbsractClass{

	public void show()
	{
		System.out.println("Method of sample class");
	}
	
	public void print()
	{
		System.out.println("Definition of abstract method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SampleClass obj = new SampleClass();
		obj.show();
		obj.print();
		obj.display();
		
		
	}

}
