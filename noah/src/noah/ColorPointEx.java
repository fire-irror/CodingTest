package noah;

public class ColorPointEx {

	public static void main(String[] args) {
		Point p=new Point();
		//Point클래스를 가리키는 객체변수 p에 의해 객체 생성
		//그 객체는 p이름으로 접근한다. 
		p.set(1, 2);
		//Point 클래스 안에 있는 set()메소드를 호출한다. 
		p.showPoint();
		//ShowPoint메소드를 호출한다. 
		
		ColorPoint cp = new ColorPoint();
		//ColorPoint클래스를 가리키는 객체 생성
		//cp라는 이름으로 접근하고, point 클래스를 상속받았기 때문에 
		//Point클래스의 멤버에 접근 가능하다. 
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
		//cp.x=100; private로 선언했기 때문에 사용 불가능.
		
	}
}
