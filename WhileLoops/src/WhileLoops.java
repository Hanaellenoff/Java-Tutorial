import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		int a = 0; 
		
//		for(int i = 0; i < 10; i++) {
//			System.out.println("as less than 10; " + i);
//		}
		
		do {
			System.out.println("a");
			a++;
		} while(a == 0);
	
	String sentance = "flapjacks are awesome!";
	
	Scanner scan = new Scanner(sentance);  
	
	ArrayList<String> words = new ArrayList<String>();
	
	while(scan.hasNext()) {
		words.add(scan.next());
	}
	
	System.out.println(words);
	}

}
