import java.util.Random;
import java.util.Scanner;

public class EightBall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a yes or no question:");
        scan.next();		
        scan.close();		
        
       Random rand = new Random();
       int r = rand.nextInt(5); 
       System.out.println(r);
       
        if (r == 0 ) {
        	System.out.println("as I see it yes");        	
        } else if (r == 1 ) {
        	System.out.println("Signs point to yes ");
        	
        } else if (r == 2 ) {
		System.out.println("Reply, hazy try again");
		
     	} else if (r == 3 ) {
	   System.out.println("outlook not so good");
	  
       } else if (r == 4 ) {
	  System.out.println("Dont count on it");
}
        
        

 
	}

}
