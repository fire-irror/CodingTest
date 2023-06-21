package th04;

import javax.swing.JLabel;

public class TimerRunnable implements Runnable {
	private JLabel timerLabel;
	
	public TimerRunnable(JLabel timerLabel) {	//timerLabel = timerLabel(ThreadInterruptEx클래스)
		this.timerLabel = timerLabel;
	}
	@Override
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				return;
			}
		}
	}
}
