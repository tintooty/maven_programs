package aggregation.student.withprivate;

public class Address {
	
	private String houseName;
	private String district;
	Student std;
	
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	
	public void printDetails()
	{
		System.out.println("Roll No: "+std.getRollNo());
		System.out.println("Name : "+std.getName());
		System.out.println("House Name : "+houseName);
		System.out.println("District : "+district);
		
	}
}
