import java.util.HashMap;
import java.util.Scanner;

public class SWnamesGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter first letter of your name \n" + "the day of the month u were born: ");
       
		
		Scanner scan = new Scanner(System.in);
		
		String letter = scan.next().toUpperCase();
		int day = scan.nextInt();
		System.out.println();
		 
		 HashMap<String, String> letters = new HashMap<String, String>();
		 HashMap<Integer, String> days = new HashMap<Integer, String>();
		 
			letters.put("A", "Anakin");
			letters.put("B ", "Boba");
			letters.put("C", "Caleb");
			letters.put("D", "Din");
			letters.put("E", "Ezra");
			letters.put("F", "Fennec");
			letters.put("G", "Grogu");
			letters.put("H", "Hunter");
			letters.put("I", "IG-11");
			letters.put("J", "Jango");
			letters.put("K", "Kanan");
			letters.put("L", "Luke");
			letters.put("M", "Mace");
			letters.put("N", "Norra");
			letters.put("O", "Obi-wam");
			letters.put("P", "Padme");
			letters.put("Q", "Qui-Gon");
			letters.put("R", "R2-D2");
			letters.put("S", "Sabine");
			letters.put("T", "Tech");
			letters.put("U", "Urai");
			letters.put("V", "Val");
			letters.put("W", "Wrecker");
			letters.put("X", "Xanatos");
			letters.put("Y", "Yoda");
			letters.put("Z", "Zeb");		 
	
			days.put(1, "Skywalker");
			days.put(2, "Kenobi");
			days.put(3, "Solo");
			days.put(4, "Fett");
			days.put(5, "Djarin");
			days.put(6, "Organa");
			days.put(7, "Windu");
			days.put(8, "Tano");
			days.put(9, "Vader");
			days.put(10, "Maul");
			days.put(11, "Hondo");
			days.put(12, "Bane");
			days.put(13, "Wren");
			days.put(14, "Jarrus");
			days.put(15, "Kanan");
			days.put(16, "Sith");
			days.put(17, "Lars");
			days.put(18, "Bridger");
			days.put(19, "Dooku");
			days.put(20, "Mothma");
			days.put(21, "Jinn");
			days.put(22, "Grievous");
			days.put(23, "Tarkin");
			days.put(24, "Shan");
			days.put(25, "Voss");
			days.put(26, "Doza");
			days.put(27, "Poe");
			days.put(28, "Togruta");
			days.put(29, "Rex");
			days.put(30, "Syndulla");
			days.put(31, "Zorii");

			System.out.println("Your star wars name is:" + letters.get(letter)+  "\n" + days.get(day));
		
	}

}
