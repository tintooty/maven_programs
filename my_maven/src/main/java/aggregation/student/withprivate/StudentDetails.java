package aggregation.student.withprivate;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stdObj = new Student();
		stdObj.setRollNo(21);
		stdObj.setName("Manu");
		Address addrObj = new Address();
		addrObj.setHouseName("Parijatham");
		addrObj.setDistrict("Kottayam");
		addrObj.setStd(stdObj);
		addrObj.printDetails();

	}

}
