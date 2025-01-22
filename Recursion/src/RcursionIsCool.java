
public class RcursionIsCool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countBackwards(5);

	}
	
	public static void countBackwards(int n) {
		if (n == 0) {
			System.out.println("done");
		} else {
			System.out.println(n);
			n--;
			countBackwards(n);
		}
		
		
	}

}
