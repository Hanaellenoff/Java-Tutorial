
class Outside {
	int a = 0;
	static class Inside {
		int b = 5;
		
	}
}
 

public class InnerStellar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outside.Inside i = new Outside.Inside();
		System.out.println(i.b);
	}

}
