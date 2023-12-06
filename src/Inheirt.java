//scope of access modifier
class Simple{
	//private int pri;
	int def;
	protected int pro;
	public int pub;
	Simple(){
		def=20;
		pro=30;
		pub=40;
		
	}
}
public class Inheirt extends Simple {
	Inheirt(){
		//pri=100;//can't access private modifier
		def=200;
		pro=300;
		pub=400;
	}

	public static void main(String[] args) {
		Inheirt i=new Inheirt();
		//can't access private modifier
		//System.out.println(i.pri);
		System.out.println(i.def);
		System.out.println(i.pro);
		System.out.println(i.pub);
	}

}
