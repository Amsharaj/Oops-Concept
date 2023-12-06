abstract class shape{
	abstract void draw(); 
	 }
class rectangle extends shape{
	void draw() {
		System.out.println("Rectangle diagram");
	}
}
class circle extends shape{
	void draw() {
		System.out.println("Circle diagram");
	}
}

public class Abstraction {

	public static void main(String[] args) {
		shape s=new circle();
		shape r=new rectangle();
		s.draw();
		r.draw();

	}

}
