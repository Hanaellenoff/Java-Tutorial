import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random(); 

		int x = rand.nextInt(6)+ 1;
	System.out.println("You rolled a:" + x);
	}

} 
