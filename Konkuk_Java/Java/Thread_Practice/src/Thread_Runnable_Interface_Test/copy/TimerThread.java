package Thread_Runnable_Interface_Test.copy;

import javax.swing.JLabel;

public class TimerThread implements Runnable {
	
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
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				return;
			}
		}
	}

}

