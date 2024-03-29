package th03;

import java.awt.Color;

import javax.swing.JLabel;

public class FlickeringLabel extends JLabel implements Runnable {
	private long delay;
	
	public FlickeringLabel (String text, long dely) {	//text는 click을 넘겨줌 , 딜레이는 500
		super(text);
		this.delay = dely;
		setOpaque(true);
		Thread th = new Thread(this);
		th.start();
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			if(n == 0)
				setBackground(Color.yellow);
			else
				setBackground(Color.GREEN);
			if(n == 0) n=1;
			else n =0;
			try {
				Thread.sleep(delay);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}
