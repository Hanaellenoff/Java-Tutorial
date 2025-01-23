interface WaterBottleInterface {
	String color = "blue";
	
	
	void fillUp();
	void pourOut();
}



public class InterfaceExample implements WaterBottleInterface {
	public static void main(String[] args) {
		System.out.println(color);
		
		InterfaceExample ex = new InterfaceExample()
;
		ex.fillUp();
	}

	@Override
	public void fillUp() {
		// TODO Auto-generated method stub
		System.out.println("Its filled up");
	}

	@Override
	public void pourOut() {
		// TODO Auto-generated method stub
		System.out.println("Its pouered out");
	}

}
