import java.util.Scanner;

public class ScannerTut{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); 
		System.out.println("Whats your first name:");
		String name = scan.next();
		System.out.println(name);
		System.out.println("whats ur age:");
		int age = scan.nextInt();
		System.out.println(age);
		System.out.println("whats your senior quote");
		String quote = scan.next();
		quote += scan.nextLine();
		
		 
		System.out.println("Hello " + name + " you are " + age + " years old ");
		System.out.println("heres your senior quote: " + quote);
		
		
	}

}
