package in03;

public class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	
	public Point() { this.x=0; this.y=0; } // x,y값을 0로 초기화
	
	public Point(int x, int y) { 	this.x=x; this.y=y;  }
	// 멤버변수 x=5, y=6이 저장

	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

}
