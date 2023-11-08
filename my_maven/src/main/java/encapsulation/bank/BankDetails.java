package encapsulation.bank;

public class BankDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank obj = new Bank();
		obj.setBalance(10000);
		obj.setName("Anu");
		System.out.println("Balance before deposite :"+obj.getBalance());
		obj.calcuate(2000);
		System.out.println("Name : "+obj.getName());
		System.out.println("Balance after deposite :"+obj.getBalance());
		

	}

}
