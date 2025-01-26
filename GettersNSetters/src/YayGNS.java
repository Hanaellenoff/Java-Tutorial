
public class YayGNS {

	String name;
	int age;

	public static void main(String[] args) {
	   
		YayGNS a = new YayGNS();
		
	
		
		a.setName("pablo");
		a.setAge(3);
		System.out.println(a.getName());
		System.out.println(a.getAge());
		a.printDetails();
		
	}
	
	public void setName(String name) {
		this.name = name;
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public Integer getAge() {
		return age;
	}
	
	public void printDetails() {
	
		System.out.println(age);
		System.out.println(name);
		
	}
	
}
