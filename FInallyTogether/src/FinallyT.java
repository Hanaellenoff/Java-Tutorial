import java.util.Scanner;

public class FinallyT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
	
		
		try {
			System.out.println(scan.next());
			
		}catch (NullPointerException e) {
			
			System.out.println(e);
			
		}finally {
			scan.close();

			
		}
	}

}
