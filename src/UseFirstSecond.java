class classfirst{
	public void display() {
		System.out.println("Class first:Display");
		}
	public void show() {
		System.out.println("Class first:show");
	}
}
class classsecond extends classfirst{
	//Overridden method display()
	public void display() {
		System.out.println("Class Second:Display");
		}
	//cannot Overridden with different access modifier(specifier)
	//Protected void show(){}
	public void show() {
		System.out.println("Class Second:show");
	}
}

public class UseFirstSecond {

	public static void main(String[] args) {
		classsecond cs=new classsecond();
		classfirst cf=new classfirst();
		cf.display();
		cf.show();
		cs.display();
		cs.show();
	}

}
