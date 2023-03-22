package in06;

public class instanceOdEx {
	static void print(Person p) {	//person p 는 new Student()와 같다
		if(p instanceof Person)
			System.out.println("Person 객체 타입");
		
		if(p instanceof Researcher) 
		System.out.println("Person 객체 타입");	//false 출력 되지 않는다
		
	
		if(p instanceof Professor) 		//true 출력된다. 
		System.out.println("Person 객체 타입");
		if(p instanceof Student) 		//true 출력된다. 
			System.out.println("Student 객체 타입");
	}

	public static void main(String[] args) {
		System.out.println("new Student() -->\t");print(new Student());			//Person p =new Student()와 같다.
		System.out.println("new Researcher() -->\t");print(new Researcher());	//Person p = new Researcher()와 같다
		System.out.println("new Professor() -->\t");print(new Professor());	
	}
}
