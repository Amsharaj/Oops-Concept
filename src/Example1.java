import java.util.Scanner;

class raj{
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(int newid) {
		id=newid;
	}
	public void setName(String newname) {
		name=newname;
	}
	public void setSalary(double newSalary) {
		salary=newSalary;
	}
}
public class Example1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		raj obj=new raj();
		int id=s.nextInt();
		s.nextLine();
		String name=s.nextLine();
		double salary=s.nextDouble();
		obj.setId(id);
		obj.setName(name);
		obj.setSalary(salary);
		System.out.println("Employee Det: ");
		System.out.println("ID: "+obj.getId());
		System.out.println("Name: "+obj.getName());
		System.out.printf("Salary: $%.2f",obj.getSalary());
s.close();
	}

}
