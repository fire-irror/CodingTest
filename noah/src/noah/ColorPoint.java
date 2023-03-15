package noah;

public class ColorPoint extends Point {

	private String color;

	public void setColor(String color) {	//점의 색을 저장
		this.color = color;	//color에 "red"저장
	}

	public void showColorPoint() {	
		System.out.print(color);
		showPoint();
	}
}