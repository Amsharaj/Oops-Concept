class parents{
	void show()
	{
		System.out.println("We are parents");
	}
}
class son1 extends parents{
	void display()
	{
		System.out.println("I am son class");
	}
}
class daughter extends parents{
	void display()
	{
		System.out.println("I am daughter class");
	}
}
public class Hierarchical {

	public static void main(String[] args) {
		son1 s=new son1();
		daughter d=new daughter();
		s.show();
		d.show();
		s.display();
		d.display();
	}

}
