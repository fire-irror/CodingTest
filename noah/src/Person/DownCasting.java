package Person;

public class DownCasting {

	public static void main(String[] args) {
		Person p = new Student("이재문");		//업캐스팅 발생
		Person p1 =new Person();		//p1객체 생성 (업캐스팅 발생 안됨)
		
		Student s,s1;
		
		// Student s2 = new Reserach();  형제관계는 업캐스팅 할 수가 없다. 
		
		s = (Student)p; //업캐스팅 된 p는 다운캐스팅 할 수 있다.
		//s1 = (Student)p1; -- 실행시 오류 발생
		
		System.out.println(s.name);
		s.grade="A";
//		System.out.println(s1.name);	-- 오류 발생
//		s1.grade="A";	--오류 발생
		
		
		//일직선의 상속관계는 업캐스팅 할 수 있지만 나머지는 할 수 없다. 
		
	}

}
