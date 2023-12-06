class bank{
	int account_no=1305;
	String name="Ravi";
	float amount=30000;
}
public class Bank_Inheritance extends bank {
	void deposite(int amount) {
		this.amount+=amount;
	}
	void withdraw(int amount) {
		this.amount-=amount;
	}

	public static void main(String[] args) {
		Bank_Inheritance si=new Bank_Inheritance();
		si.withdraw(1000);
		System.out.println("Account Number:"+si.account_no);
		System.out.println("Name:"+si.name);
		System.out.println("Amount:"+si.amount);

	}

}
