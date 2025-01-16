import java.util.Scanner;

public class MultipleChoice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scan = new Scanner(System.in);
		String[] responses = {"", "",};
		String[] answers = {"C", "A",};
		
		System.out.println("what is 2 + 2");
		System.out.println("A, 2");
		System.out.println("B, 3");
		System.out.println("C, 4");
		System.out.println("D, 5");
		
		System.out.println("Whats the capitol of NC");
		 System.out.println("A, Raleigh");
		System.out.println("B, Durham");
		System.out.println("C, Cary");
		System.out.println("D, Winston");

		responses[0] = scan.next();
		responses[1] = scan.next();

		System.out.println(responses[0]);
		System.out.println(responses[1]); 
		
		int score = 0;
		
		for(int i = 0; i < 2; i++) {
			if(responses[i].equalsIgnoreCase(answers[i])) {
				score++;
			}
	}
		System.out.println("Score:" + score + "/2");
	}

}
