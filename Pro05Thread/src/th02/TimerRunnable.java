package th02;

import javax.swing.JLabel;

public class TimerRunnable implements Runnable{
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	@Override
	public void run() {
		int n =0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);	//1000은 1초를 의미하는데 1초씩 지연시키라는 뜻
				//sleep()메소드를 사용할 경우 try~catch사용
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}
