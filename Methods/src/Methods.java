
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Welcome();
		int sum = Add(5, 4);
		String shouting = caps("what is it "); 
		int[] awesomeArray = gimmeArrayFromInts(3, 7, 1) ;
		System.out.println(awesomeArray[0]);
		System.out.println(awesomeArray[1]);
		System.out.println(awesomeArray[2]);
 	}

	public static String caps(String s) {
		return s.toUpperCase(); 
	}
	
	public static int Add (int a, int b) {
		return a +  b;
	}
	
	
	public static void Welcome() {
		System.out.println("Welcome to our calculator program");

	}
	
	public static int[] gimmeArrayFromInts(int a, int b, int c) { 
	 int[] array = new int[3];
	 array[0] = a;
	 array[1] = b;
	 array[2] = c;
	 return array;
	}
}

