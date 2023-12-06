abstract class bike{
	abstract void run();
	void display() {
		System.out.println("Non-abstract-menthod");
	}
}
public class Pulsar extends bike {
	void run() {
		System.out.println("Running Safely");
	}

	public static void main(String[] args) {
		bike obj=new Pulsar();
		obj.display();
		obj.run();

	}

}
