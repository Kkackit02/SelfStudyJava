package final_202112346;

public class SyncCounter extends Counter {

	
	public SyncCounter(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	synchronized public void increment()
	{
		this.number++;
	}
	
	@Override
	synchronized public void decrement()
	{
		this.number--;
	}
}
