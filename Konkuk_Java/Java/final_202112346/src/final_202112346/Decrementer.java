package final_202112346;

public class Decrementer implements Runnable {

	Counter counter;
	public Decrementer(Counter counter)
	{
		this.counter = counter;
	}
	public Decrementer(SyncCounter counter)
	{
		this.counter = counter;
	}
	@Override
	public void run()
	{
		System.out.println("Decrementer thread starts");
		for (int i = 0; i < 10000; i++)
		{
			counter.decrement();

			/*
			try 
			{
				Thread.sleep(1);
			}
			catch(InterruptedException e)
			{
				return;
			}
			*/
			
		}
	}
}
