
public class NestedForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	String[] colors = {"red", "blue", "green"};
	for(int i = 0; i < 3; i++ ) {
     System.out.println(colors[i]);
	}

	String[][] fancyColors = {{"red", "blue", "green"},
                              {"cyan", "magenta"," turquoise"}
	};
	
	  for(int row = 0; row < 2; row ++) {
		  for(int column = 0; column < 3; column++ ) {
			     System.out.println(fancyColors[row][column]);
				}
		  
		 for(int i = 0; i < 5; i++){
		   for(int j = 0; j < 10; j++) {
		    System.out.println("i:" + i + "j;" + j);
		 
		 }
		 
		 }
	  }
	}
}
 