import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("how many stars would u like:");
		Scanner scan = new Scanner(System.in);
		
		int numOfStars = scan.nextInt();
		
	for(int i = 1; i <= numOfStars ; i ++) {
       for(int j = 0; j < i ; j++) {
		System.out.print("*");
	}
		System.out.println();
 
	
		
}
	
	for(int i   = numOfStars - 1; i > 0; i--) {
		 for(int j = 0; j < i; j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	}
  }
}