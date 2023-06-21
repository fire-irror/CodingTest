package th04;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ThreadInterruptEx extends JFrame{
	private Thread th;	//스레드 객체 변수르 선언
	public ThreadInterruptEx() {
		setTitle("ThreadInterruptEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();		//컨테이너 박스를 생성
		c.setLayout(new FlowLayout());		//c컨테이너에 오브젝트를 어떻게 배치 할 것인가?
		
		JLabel timerlabel = new JLabel();
		timerlabel.setFont(new Font("Gothic", Font.ITALIC, 80));	//글꼴 고딕 폰트 이탈릭, 크기 80
		
		TimerRunnable runnable = new TimerRunnable(timerlabel);
		//TimerRunnable클래스의 객체 생성, 생성자를 호출한다.
		
		th = new Thread(runnable);
		//스레드 객체 생성
		c.add(timerlabel);
		
		JButton btn = new JButton("kill timer");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				th.interrupt();
				btn.setEnabled(false);
			}
		});
		c.add(btn);
		setSize(300,170);
		setVisible(true);
		
		th.start();
	}
	public static void main(String args[]) {
		new ThreadInterruptEx();
	}
}
