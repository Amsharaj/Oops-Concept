import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Account {
	static int Ac_id;
	static String name;
	static String Address;
	static long contact;
	static int amount;
	//static float total,average;//class variable
	
	static void display(int Ac_id,String name,String Address,long contact,int amount) {
		System.out.println("Account deatails");
		System.out.println("Ac id:"+Ac_id);
		System.out.println("Name:"+name);
		System.out.println("Address:"+Address);
		System.out.println("Contact:"+contact);
		System.out.println("Amount:"+amount);}
		
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);  
		System.out.print("Enter the Ac id:");
		Ac_id = s.nextInt();
		System.out.print("Enter the name:");
        name=s.next();
        System.out.print("Enter the address:");
        //Address=s.next();
       // s.nextLine();
        DataInputStream object =new DataInputStream(System.in);
        String Address=object.readLine();
        System.out.print("Contact no:");
        contact=s.nextLong();
        System.out.print("Balance:");
        amount=s.nextInt();
        display(Ac_id,name,Address,contact,amount);
      
s.close();
	}

}
