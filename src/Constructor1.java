import java.util.Scanner;

public class Constructor1 {
	int emp_id,salary;
	String emp_name;
   Constructor1() {
	   //default constructor-no parameters inside the constructor method
	   emp_id=10;
	   emp_name="raj";
	   salary=10000;
		}
   Constructor1(int id,String name,int sal){
	   //parameterized construction
	   emp_id=id;
	   emp_name=name;
	   salary=sal;
   }
   void display() {
	   System.out.println("Employee details:");
	   System.out.println("Employee id:"+emp_id);
	   System.out.println("Employee name:"+emp_name);
	   System.out.println("Employee salary:"+salary);
   }

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id,salary;
		String name;
		System.out.print("Employee id:");
		id=s.nextInt();
		System.out.print("Employee name:");
		name=s.next();
		System.out.print("salary:");
		salary=s.nextInt();
		Constructor1 obj=new Constructor1();
		obj.display();
		Constructor1 obj1=new Constructor1(4,"raj",2500);
		obj1.display();
		Constructor1 obj2=new Constructor1(id,name,salary);
		obj2.display();
		s.close();
		
	}

}
