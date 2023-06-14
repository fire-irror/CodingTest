package th01;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadTimerEx extends JFrame{
	public ThreadTimerEx() {
		setTitle("Thread를 상속 받은 다이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//창을 닫을 때 프로그램이 종료된다.
		Container c = getContentPane();	//컨테이너 박스를 생성
		c.setLayout(new FlowLayout());	//c컨테이너에 오브젝트를 어떻게 배치할 것인가
		
		JLabel timerLabel = new JLabel();	//레이블 생성
		timerLabel.setFont(new Font("Gothic",Font.ITALIC,80));	//글꼴 고딕 이텔릭체, 크기80
		c.add(timerLabel);	//c컨테이너에 타이머 라벨을 둔다. 
		
		TimerThread th = new TimerThread(timerLabel);
		setSize(300,170);	//화면 프레임 size를 나타낸다
		setVisible(true);	//컨테이너를 화면에 출력 true일때 
		
		th.start();	//TimerThread클래스에 있는 run() 메소드가 호출된다.
	}

	public static void main(String[] args) {
		//main 메서드도 스레드이다.
		//main 메서드가 다른 스레드보다 먼저 종료될 수 있다.
		new ThreadTimerEx();	//이름이 없는 익명의 객체 생성 후 생성자가 호출된다.
		for(int i=0; i<100; i++) {
			System.out.println("Thead" + i);
		}
	}

}
