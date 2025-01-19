import java.util.Scanner;

public class TryCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Whats your fav number?");
		
		try {
		int n = scan.nextInt();
	        
		System.out.println(n);
		} catch(Exception e) {
			

		System.out.println("Pls type a number");
		}
	}

}
 