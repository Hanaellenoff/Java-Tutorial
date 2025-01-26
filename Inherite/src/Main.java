
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mouse1 m1 = new Mouse1();
		Mouse2 m2 = new Mouse2();
		Mouse3 m3 = new Mouse3();
		

		m1.leftClick();
		m2.rightClick();
		m1.scrollDown();
		m1.scrollUp();
		
		m2.connect();
	}

}
