package noah;

public class MethodOverriedingEx {
	public static void main(String args[]) {
		Rect r = new Rect();	//r은 Rect 클래스를 가리키는 객체 변수 
		Shape s;
		s = r;
		//Shape p = r; 이런식으로 표현해도 된다.
		//Shape p = new Rect
		
		System.out.println(s.a);	//Shape클래스의 멤버 a:123
		System.out.println(s.b);	//b=456.789 (둘 다 shape 클래스의 멤버)
		s.draw();	//(Rectangle 클래스의 메소드)
		s.draw2();	//(Shape 클래스의 메소드)
		//s는 하위클래스인 Rect클래스로 upcasting하게 되면 
		//s는 하위클래스의 재 정의된 메소드에만 접근 가능하고
		//원래 s는 Shape클래스의 모든 멤버에 접근할 수 있는데, 
		//Overriding 재 정의된 메소드만 접근불가.
		//s.draw3(); ==> 오류 원인 : 재 정의가 되지 않아 접근 불가
		//(메소드를 정의하지 않았다. Overriding이 안돼서)
	}

}
