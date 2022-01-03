package Thread_Test;

import javax.swing.JLabel;

public class TimerThread extends Thread {
	
	private JLabel timerLabel;
	public TimerThread(JLabel timerLabel)
	{
		this.timerLabel = timerLabel;
	}
	int n = 0;
	
	@Override
	public void run()
	{
		while(true)
		{
			timerLabel.setText(Integer.toString(n));
			System.out.println(n);
			n++;
			
			try 
			{
				sleep(1000);
			}
			catch(InterruptedException e)
			{
				return;
			}
		}
	}

}

