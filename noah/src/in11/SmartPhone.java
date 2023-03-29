package in11;
public class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface {

	@Override
	public void sendCall() {
		System.out.println("따르릉따르릉~~");
		
	}
	@Override
	public void receiveCall() {
		System.out.println("전화왔어요");
		
	}

	@Override
	public void play() {
		
		System.out.println("음악 연주합니다");
	}

	@Override
	public void stop() {
		System.out.println("음악을 중단합니다");
		
	}
	@Override
	public void sendSMS() {
		System.out.println("문자갑니다.");
		
	}
	@Override
	public void receivesSMS() {
		System.out.println("문자왔어요");
		
	}
	//추가로 작성한 메소드
	public void schedule() {
		System.out.println("이렁을 관리합니다.");
	}

}
