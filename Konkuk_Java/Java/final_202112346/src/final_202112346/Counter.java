package final_202112346;

public class Counter {
	
	int number = 0;
	
	public Counter(int num)
	{
		this.number = num;
	}
	
	public int getNumber()
	{
		return this.number;
	}
	
	public void increment()
	{
		this.number++;
	}
	
	public void decrement()
	{
		this.number--;
	}

}
