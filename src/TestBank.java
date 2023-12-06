abstract class Bank1{
	abstract int getrateofintrest();
}
class SBI extends Bank1{
	int getrateofintrest() {
		return 7;
	}
}
class PNB extends Bank1{
	int getrateofintrest() {
		return 8;
	}
}
public class TestBank {

	public static void main(String[] args) {
		Bank1 b;
		b=new SBI();
		System.out.println("Rate if intrest is:"+b.getrateofintrest()+"%");
		b= new PNB();
		System.out.println("Rate if intrest is:"+b.getrateofintrest()+"%");

	}

}
