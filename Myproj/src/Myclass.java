import java.util.Random;

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int result = addNumbers(1, 2, 3);
		double result2 = addNumbers(1.1, 1.2);
		addNumbers();
		System.out.println(result);

	}
	
	public static int addNumbers(int a, int b) {
		return a + b;
	}
	public static double addNumbers(double a, double b) {
		return a + b;
	}
	public static int addNumbers(int a, int b, int c) {
		return a + b + c;
	}
	public static void addNumbers() {
		Random r = new Random();
		System.out.println(r.nextInt(6 + r.nextInt(6)));
	}
}
