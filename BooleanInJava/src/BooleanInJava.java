
public class BooleanInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      int a = 0;
      boolean passedDoor = true;
      boolean missedDoor = false;
      int doorCount = 0;
      boolean passedAllDoors = false;
//      System.out.println(b);
      
      if(passedDoor) {
    	  System.out.println("1st door passed");
    	  doorCount += 1;
      }
      
      if(passedDoor) {
    	  System.out.println("2nd door passed");
    	  doorCount += 1;
      }
      
      if(passedDoor) {
    	  System.out.println("3rd door passed");
    	  doorCount += 1;
      }
 if (doorCount == 3) {
	 passedAllDoors = true; 
	 System.out.println("You passed all doors");
 }
      
	}

}
