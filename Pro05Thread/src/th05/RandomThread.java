package th05;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JLabel;

public class RandomThread extends Thread {
	private Container contentPane;
	private boolean flag = false;

	public RandomThread(Container contentPane) {
		//생성자 실행 후, ThreadFinishFlagEx클래스에 있는 컨테이너를 받는다.
		this.contentPane = contentPane;
	}

	void finish() {
		flag = true;
	}

	@Override
	public void run() {
		while (true) {
			int x = ((int) (Math.random() * contentPane.getWidth()));
			//contentPane.getWidth()는 컨테이너의 너비
			//Math.random()은 0보다 크고 1보다 작은 어떤값이 발생
			int y = ((int) (Math.random() * contentPane.getWidth()));
			//contentPane.getHeight()는 컨테이너의 높이 

			JLabel label = new JLabel("Java");
			label.setSize(80, 30);
			label.setLocation(x, y);
			contentPane.add(label);
			contentPane.repaint();	//화면을 다시 그리는 메소드이다
			try {
				Thread.sleep(300);
				if (flag == true) {
					contentPane.removeAll();
					//컨테이너ㅔ 있는 모든 오브젝트를 삭제한다.
					label = new JLabel("finish"); //새로운 레이블 생성.
					label.setSize(80, 30);
					label.setLocation(100, 100);
					label.setForeground(Color.RED);
					contentPane.add(label);
					contentPane.repaint();
				}
			} catch (InterruptedException e) {
				return;
			}
		}
	}

}
