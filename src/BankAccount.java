import java.util.Scanner;

class method{
	private String number;
	private float bal;
	public String getNumber(){
		return number;
	}
	public float getBalance() {
		return bal;
	}
	public void setNumber(String newNumber) {
		number=newNumber;
	}
	public void setBalance(float newBal) {
		bal=newBal;
	}
}
public class BankAccount {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		method obj=new method();
		String number=s.next();
		float bal=s.nextFloat();
		obj.setNumber(number);
		obj.setBalance(bal);
		System.out.println("Account Number: "+obj.getNumber());
		System.out.println("Balance: "+obj.getBalance());
				
s.close();
	}

}
