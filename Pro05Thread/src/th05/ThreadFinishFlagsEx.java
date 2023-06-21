package th05;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class ThreadFinishFlagsEx extends JFrame{
	private RandomThread th;
	
	public ThreadFinishFlagsEx() {
		setTitle("ThreadFinishFlagsEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();		//컨테이너 박스를 생성
		c.setLayout(new FlowLayout());		//c컨테이너에 오브젝트를 어떻게 배치 할 것인가?
		
		//컨테이너에서 마우스를 눌렀을 떄 이번트(mousePressed)가 발생하면서
		//아래 코드가 실행된다.
		
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				th.finish();
			}
		});
		setSize(300,200);
		setVisible(true);
		
		th = new RandomThread(c);
		th.start();	//thread 실행.
	}
	public static void main(String args[]) {
		new ThreadFinishFlagsEx();
	}
}
