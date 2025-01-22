import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ArrayList<Integer> nums = new ArrayList<Integer> ();
	nums.add(12);
	nums.add(54);
	nums.add(32);
	nums.add(665);
	
	Iterator<Integer> it = nums.iterator();
	
	while(it.hasNext()) {
		int i = it.next();
		if(i < 50) {
			it.remove();
		}
	}
	System.out.println(nums);
	
	
 	
	}

}
