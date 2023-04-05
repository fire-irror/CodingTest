package pack01;

// 이 클래스는 모든 클래스의 아버지 클래스이다. 
public class ObjectPropertyEx {
	public static void prin(Object obj) {				//Object obj = p와 같은 문장(업캐스팅)
		System.out.println(obj.getClass().getName());	//클래스 이름 출력
		System.out.println(obj.hashCode());				//point 클래스의 고유코드
		System.out.println(obj.toString());				//패키지를 포함한 클래스이름과 해시코드(16진수)
		System.out.println(obj);						//
		
	}
}
