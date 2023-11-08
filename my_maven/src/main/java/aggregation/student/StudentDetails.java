package aggregation.student;

public class StudentDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stdObj = new Student(4100, "Anu");
		Address adrObj = new Address("Harsham","Ernakulam",stdObj);
		adrObj.print();
		

	}

}
