import java.util.Scanner;

abstract class colour{
	abstract double calculateArea();
	abstract double calculatePerimeter();}
abstract class Cricle extends colour{
	private float radius;
	Cricle(float radius){
		this.radius=radius;
	}
	double calculateArea() {
		return Math.PI*radius*radius;
		}
	double calculatePerimeter() {
		return 2*Math.PI*radius;
	}
}
abstract class Tringle extends colour{
	private double side1,side2,side3;
	public Tringle(double side1,double side2,double side3) {
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	double calculateArea() {
		double s=(side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		
	}
	double calculatePerimeter() {
		return side1+side2+side3;
		
	}
}
	
	 
public class Abstraction_test1 {
	@SuppressWarnings({ "unused", "resource" })
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		//float radius=s.nextFloat();
	//	double side1=s.nextDouble();
		//double side2=s.nextDouble();
		//double side3=s.nextDouble();
	}

}
