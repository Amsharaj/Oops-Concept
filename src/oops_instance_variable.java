import java.util.Scanner;

class Instance{
	private String name;
	private int age;
	private String country;
	
	//getter and setter methods
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getCountry() {
		return country;
	}
	public void setName(String newValue) {
		name=newValue;
	}
	public void setAge(int newValue) {
		age=newValue;
	}
	public void setCountry(String newValue) {
		country=newValue;
	}
}
public class oops_instance_variable {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		Instance obj=new Instance();
		String name=s.nextLine();
		int age=s.nextInt();
		String country=s.next();
		obj.setName(name);
		obj.setAge(age);
		obj.setCountry(country);
		System.out.println("Name:"+obj.getName());
		System.out.println("Age:"+obj.getAge());
		System.out.println("Country:"+obj.getCountry());

s.close();
	}

}
