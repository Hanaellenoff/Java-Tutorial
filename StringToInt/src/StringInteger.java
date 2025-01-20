
public class StringInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "age: 47";
		
		
		s = s.replaceAll("\\D+", "");
		int n = Integer.parseInt(s);
		
		System.out.println(n + 2); 

	}

}
