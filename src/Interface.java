interface myinterface{
	//compiler will treat them as:
	//public abstract void method1();
	//public abstract void method2();
	public void method1();
	public void method2();
}
public class Interface implements myinterface {
	public void method1() {
		System.out.println("implementation of method1");
	}
	public void method2() {
		System.out.println("implementation of method2");
	}
	public static void main(String[] args) {
		myinterface obj=new Interface();
		obj.method2();
		
		
	}

}
