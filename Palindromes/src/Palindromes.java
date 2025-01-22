
public class Palindromes {

	public static void main(String[] args) {
		// mom dad racecar nurses run
 
		String og = "racecar ";
		char b = 'm';
		String reverse = "";

		for(int i = og.length()- 1; i >= 0; i--) {
			reverse += og.charAt(i);
			System.out.println(reverse);
		
		}
		boolean palindrome = true; 
		for(int i =0; i < og.length(); i++) {
			System.out.println(i);
			if(og.charAt(i) != reverse.charAt(i)) {
				palindrome = false;
			}
		}
		if (palindrome) {
			System.out.println("palindrome");
		} else {
			System.out.println("not a palindrome");
		}
			
	}

}
