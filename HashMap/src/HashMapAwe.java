import java.util.HashMap;

public class HashMapAwe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 
		HashMap<String, String> fun = new HashMap<String, String>();
		
		fun.put("bobbyJoe1996", "FluffyPonies");
		fun.put("helloKittyFan21", "AloeVera");
		fun.put("coolGuyswag", "password123");
		
		fun.remove("helloKittyFan21");
		System.out.println(fun.replace("coolGuyswag", "betterPassword") );

		System.out.println(fun);
	}

}
