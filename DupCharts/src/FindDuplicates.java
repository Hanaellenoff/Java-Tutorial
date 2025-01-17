
public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String sentance = "How many duplicates are there?";
		 System.out.println(sentance);
		
		String charecters = "";
		String duplicates = "";
		
		for(int i = 0; i < sentance.length(); i++) {
//			System.out.println(sentance.c harAt(i));
			String current = Character.toString(sentance.charAt(i));
			if(charecters.contains(current))    {
				if (!duplicates.contains(current)) {
				duplicates +=  current + ",";
				   
					}  
			}
			charecters += current;
		  }
			System.out.println(duplicates);
		} 
	}
