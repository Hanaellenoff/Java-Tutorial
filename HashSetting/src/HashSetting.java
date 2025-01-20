import java.util.HashSet;
import java.util.Iterator;

public class HashSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	
		HashSet<Integer> hashbrowns = new HashSet<Integer>();
		
		hashbrowns.add(13);
		hashbrowns.add(2);
		hashbrowns.add(24);
		
	   Iterator<Integer> it = hashbrowns.iterator()
; 
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	
		
	}

}
