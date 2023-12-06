interface inter1{
	public void fun1();
}
interface inter2 extends inter1{
	public void fun2();//all methods inside interface should be public
}
class interimple implements inter1,inter2{
	public void fun1() {
		System.out.println("Interface 1");
	}
	public void fun2() {
		System.out.println("Interface 2");
	}
}
public class MainclassInterface {

	public static void main(String[] args) {
		interimple obj=new interimple();
		inter2 obj2=obj;new interimple();
	//	obj.fun();
		obj2.fun1();
		obj2.fun2();

	}

}
