class Student1{
	int rollno;
	String name;
	float fee;
	Student1(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println("Rollno:"+rollno+" "+"\nName:"+name+" "+"\nFee:"+fee);
	}
}
public class TestThis1 {

	public static void main(String[] args) {
		Student1 s1=new Student1(111,"raj",3000f);
		
		Student1 s2=new Student1(143,"raja",4000f);
		s1.display();
		s2.display();
	}

}
