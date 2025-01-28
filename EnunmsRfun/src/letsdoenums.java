enum Flavor {
	CHOCOLATE, VANILLA, STRAWBERRY;
}


public class letsdoenums {

//	String[] levels = {"low", "medium","high"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Flavor flav = Flavor.CHOCOLATE;
		
		if (flav == Flavor.VANILLA) {
			System.out.println("vanilla");
		
		} else if (flav == Flavor.CHOCOLATE) {
			System.out.println("choco");
		} else {
			System.out.println("Vanilla");
		}
			


	}

}
