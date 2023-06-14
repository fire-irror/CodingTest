package in01;

public class ColorPoint extends Point {
	private String color;

	public void setColor(String color) { // 점의 색을 저장
		this.color = color; // color에 "red" 저장 
	}
	
	public void showColorPoint() { // 컬럼 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 메소드를 호출
	}
}

