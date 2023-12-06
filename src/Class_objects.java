import java.util.Scanner;

public class Class_objects {
	static int id;
	static String name;
	static int m1,m2,m3;
	//static float total,average;//class variable
	
	static void display(int id,String name,int m1,int m2,int m3) {
		float total,average;
		total = m1+m2+m3;
		average=total/3;
		System.out.println("Student deatails");
		System.out.println("Student id:"+id);
		System.out.println("Student name:"+name);
		System.out.println("Mark1:"+m1);
		System.out.println("Mark2:"+m2);
		System.out.println("Mark3:"+m3);
		System.out.println("Total:"+total);
		System.out.printf("Average: %.2f",average);

	}
	

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the Student id:");
		id = s.nextInt();
		System.out.print("Enter the Student name:");
        name=s.next();
        System.out.print("Mark1:");
        m1=s.nextInt();
        System.out.print("Mark2:");
        m2=s.nextInt();
        System.out.print("Mark3:");
        m3=s.nextInt();
        display(id,name,m1,m2,m3);
s.close();
	}

}
