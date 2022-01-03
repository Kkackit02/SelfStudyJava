package final_202112346;

public class Incrementer implements Runnable {

	Counter counter;
	public Incrementer(Counter counter)
	{
		this.counter = counter;
	}
	public Incrementer(SyncCounter counter)
	{
		this.counter = counter;
	}
	
	
	@Override
	public void run()
	{
		System.out.println("Incrementer thread starts");
		for (int i = 0; i < 10000; i++)
		{
			counter.increment();

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
