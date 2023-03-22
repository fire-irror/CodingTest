package in05;

public class Student extends Person{
	public void set() {
		age=30;
		name="홍길동";
		height=175;
		//weight=99; private로 선언했기 때문에 
		setWeight(99);
	}
}
