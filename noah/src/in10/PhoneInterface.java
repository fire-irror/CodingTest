package in10;

interface PhoneInterface {
	int TIMEOUT = 10000;		//public static final 이 생략됨 --상수
	void sendCall();			//abstract가 생략됨 -- 추상 메소드
	void receiveCall();			//abstract가 생략됨 -- 추상 메소드
	
	default void printlogo() {	//default가 없으면 에러가 남. 
		System.out.println("**Phone**");
	}
}
