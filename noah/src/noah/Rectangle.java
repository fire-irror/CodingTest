package noah;

class Rectangle1 {
	int width;
	int height;
	int x1, x2;
	int y1, y2;

	Rectangle1(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}

	void showRectangle() {
		System.out.println("사각형의 좌표는 왼쪽 위 : " + "(" + x1 + "," + y1 + ")");
		System.out.println("사각형의 좌표는 왼쪽 위 : " + "(" + x2 + "," + y2 + ")");
	}

	int getRound() {
		width = y1 - x1;
		height = y2 - x2;
		return 2 * (width + height);
	}

	int getArea() {
		return width * height;
	}
}

public class Rectangle {

	public static void main(String[] args) {
		Rectangle1 t1 = new Rectangle1(1, 1, 3, 3);
		t1.showRectangle();
		System.out.println("사각형의 둘레: " + t1.getRound());
		System.out.println("사각형의 넓이: " + t1.getArea());
	}

}

