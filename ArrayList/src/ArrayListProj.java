
import java.util.ArrayList;

public class ArrayListProj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] fruits = new String[4];
		fruits[0] = "Mango";
		fruits[1] = "Grapes";
		fruits[2] = "Strawberry";
		fruits[3] = "Orange";
		System.out.println(fruits[1]);
		
		ArrayList fruitLists = new ArrayList(); 
		fruitLists.add("Mango");
		fruitLists.add("grapes");
		fruitLists.add("strawberry");
		fruitLists.add("orange");
		fruitLists.contains("rasberry");
	 
		System.out.println(fruitLists.contains("rasberry"));
	}

}
