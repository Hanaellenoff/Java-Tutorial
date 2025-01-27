class Bird {
	public void sing() {
		System.out.println("tweet");
	}
}

class Robin extends Bird {
	public void sing() {
		System.out.println("twiddle");
	}
	
}

class Pelican extends Bird {
	public void sing() {
		System.out.println("Kwahh");
	}
}


public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pelican b = new Pelican();
		b.sing();
		}

}
 