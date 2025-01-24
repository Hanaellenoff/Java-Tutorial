
class Outside {
	int a = 0;
	class Inside {
		int b = 5;
		
	}
}
 

public class InnerStellar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outside o = new Outside();
		Outside.Inside i = o.new Inside();
		System.out.println(o.a + " " + i.b);
	}

}
