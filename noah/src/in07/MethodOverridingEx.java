package in07;

public class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw();
	}

	public static void main(String[] args) {
		Line line = new Line();	//line 객체 생성
		paint(line);	//Shape p = line	p.draw()는 Line클래스에 있는 draw()호출	
		paint(new Shape());	//Shape p = newn Shape()와 같다. p.draw()는 Shape 클래스에있는 draw()호출
		paint(new Line());
		paint(new Rect());
		paint(new  Circle());
	}
}
