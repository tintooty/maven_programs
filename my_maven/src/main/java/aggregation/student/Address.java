package aggregation.student;

public class Address {
	
	String houseName;
	String district;
	Student std;
	
	public Address(String houseName,String district,Student std)
	{
		this.houseName = houseName;
		this.district = district;
		this.std = std;
	}
	
	public void print()
	{
		System.out.println("Roll No :" +std.rollNumber);
		System.out.println("Name : "+std.name);
		System.out.println("House Name : "+houseName);
		System.out.println("District : "+district);
		
	}

	
}
