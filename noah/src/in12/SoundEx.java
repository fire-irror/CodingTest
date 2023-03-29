package in12;

public class SoundEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sound tv=new Tv();   	//tv는 sound인터페이스를 가리키는 객체변수이지만 tv클래스를 할당
		Sound radio=new Radio();	//radio는 soundn인터페이스를 가리키는 객체변수이지만 radio클래스를 할당
		tv.SoundUp(5);		//tv객체변수는 TV클래스에 있는 재정의된 SoundUp()메소드를 호출
		tv.SoundDown(10);	
		radio.SoundDown(5);	//radio객체변수는 Radio클래스에 있는 재정의된 SoundUp()메소드를 호출
		radio.SoundUp(10);
	}

}