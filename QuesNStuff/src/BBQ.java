import java.util.LinkedList;
import java.util.Queue;

public class BBQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Queue<String> q = new LinkedList<String>();
	q.add("a");
	q.add("b");
	q.add("c");
	
	System.out.println(q.toArray()[2]);

	}

}
