import java.util.Random;

public class Fortunes {

	static String[] fortunes = {
			"Today it's up to you to create the peacefulness you long for.",
			"A friend asks only for your time not your money.",
			"If you refuse to accept anything but the best, you very often get it.",
			"A smile is your passport into the hearts of others.",
			"A good way to keep healthy is to eat more Chinese food.",
			"Your high-minded principles spell success.",
			"Hard work pays off in the future, laziness pays off now.",
			"Change can hurt, but it leads a path to something better."
	};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Random rand = new Random();
	int r = rand.nextInt(fortunes.length);
	  System.out.println(fortunes[r]);
		
	}

}
