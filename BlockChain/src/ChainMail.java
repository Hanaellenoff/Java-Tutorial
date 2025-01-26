class Student {
	String name;
	int grade;
	
	
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	
	public Student setGrade(int grade) {
		this.grade = grade;
		return this;
	}
}



public class ChainMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student();
		s.setGrade(67).setName("bob");
		
		System.out.println(s.name);
		System.out.println(s.grade);
	}
}
