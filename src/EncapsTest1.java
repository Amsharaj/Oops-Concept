class Encapsulation{
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
public class EncapsTest1 {

	public static void main(String[] args) {
		Encapsulation obj=new Encapsulation();
		obj.setName("RAJA");
		obj.setAge(33);
		obj.setCountry("India");
		System.out.println("Name:"+obj.getName());
		System.out.println("Age:"+obj.getAge());
		System.out.println("Country:"+obj.getCountry());

	}

}
