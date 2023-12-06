abstract class sum{//abstract class
	public abstract int sumoftwo(int n1,int n2);
	public abstract int sumofthree(int n1,int n2,int n3);
	//regular class
	public void display() {
		System.out.println("Method of class sum");
	}
}
//regular class extends abstract class
public class Demo extends sum{
	//if i don't provide the implementation of these two methods,the program will throw compilation error.
	public int sumoftwo(int num1,int num2) {
		return num1+num2;
	}
	public int sumofthree(int num1,int num2,int num3) {
		return num1+num2+num3;
	}
	

	public static void main(String[] args) {
		sum obj=new Demo();
		System.out.println(obj.sumoftwo(7, 10));
		System.out.println(obj.sumofthree(7, 10, 2));
		obj.display();

	}

}
