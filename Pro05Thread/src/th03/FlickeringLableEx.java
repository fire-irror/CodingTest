package th03;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlickeringLableEx extends JFrame {
	public FlickeringLableEx() {
		setTitle("FlickeringLableEx 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		//깜빡이는 레이블 생성
		FlickeringLabel flable1 = new FlickeringLabel("click", 500);
		
		//깜빡이지 않는 레이블 생성
		JLabel lable = new JLabel("not click");
		
		FlickeringLabel flable2 = new FlickeringLabel("here click", 300);
		
		c.add(flable1);
		c.add(lable);
		c.add(flable2);
		
		setSize(300,150);
		setVisible(true);		
	}
	
	public static void main(String args[]) {
		new FlickeringLableEx();
		
	}

}
