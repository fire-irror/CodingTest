package th03;

import java.lang.Thread.State;

public class ThreadMainEx {
	public static void main(String args[]) {
		long id = Thread.currentThread().getId();			//현재 실행되고 있는 스레드(main)의 id
		String name = Thread.currentThread().getName();		//현재 실행되고 있는 스레드(main)의 이름
		int Prority = Thread.currentThread().getPriority();	//우선순위의 기본값은 5로 설정이 된다.
		Thread.State s = Thread.currentThread().getState();
		System.out.println("현재 스레드 이름 : " + name);
		System.out.println("현재 스레드 id : " + id);
		System.out.println("현재 스레드 우선순위 : "+Prority);
		System.out.println("현재 스레드상태 : " +s);
		}
}
