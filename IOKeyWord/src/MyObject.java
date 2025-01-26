interface Bird {
	public void sing();
	
}
	  

class Eagle implements Bird {
	
  public void sing() {
	  System.out.println("Bird is singing");
	}
  }
	




public class MyObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		MyObject o = new MyObject();
		Eagle e = new Eagle();
		
		System.out.println(e instanceof Bird );
		
		

	}

}
