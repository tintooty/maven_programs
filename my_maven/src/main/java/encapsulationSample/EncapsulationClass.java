package encapsulationSample;

public class EncapsulationClass {
	
	private int age;
	private String name;
	
	public void setter(int age,String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public void getter()
	{
		System.out.println("Name :"+name);
		age = age*10;
		System.out.println("Age :"+age);
	}

}
