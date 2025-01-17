
public class Encrypt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Alex
		//bmfy
		//-1			
		int key = 6;
		
		String text = "Nk&nu}y&oz&ngtmotE";
		
		char[] chars = text.toCharArray();
		
		for(char c : chars) {
			c -= key;
			System.out.print(c);
		}
	}

}
