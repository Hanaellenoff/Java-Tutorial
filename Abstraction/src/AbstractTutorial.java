
interface DogInterface {
	void bark();
	void whine(); 
}

abstract class Dog {

  public void bark() {
	  System.out.println("Bark");
  }

  public abstract void whine();
}

class Chihauha implements DogInterface {

	public void whine() {
		System.out.println("Dog whined");
	}

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		
	}
}
 
 
public class AbstractTutorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chihauha d = new Chihauha();
		d.bark();
		d.whine();

	}

}
