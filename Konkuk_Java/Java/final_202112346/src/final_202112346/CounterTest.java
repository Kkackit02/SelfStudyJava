package final_202112346;

import java.lang.Thread.State;

public class CounterTest {
	

	
	
	public static void main(String[] args) {
		
		
		Counter counter = new Counter(5);
		SyncCounter syncCounter = new SyncCounter(5);
		
		System.out.println("initial number w/o sync = " + counter.getNumber());
		System.out.println("initial number with sync = " + syncCounter.getNumber());
		
		Incrementer incrementor = new Incrementer(counter);
		Decrementer decrementor = new Decrementer(counter);
		
		Incrementer syncIncrementor = new Incrementer(syncCounter);
		Decrementer syncDecrementor = new Decrementer(syncCounter);
		
		Thread t1 = new Thread(incrementor);
		Thread t2 = new Thread(syncIncrementor);
		Thread t3 = new Thread(decrementor);
		Thread t4 = new Thread(syncDecrementor);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		synchronized(t1){
            try{
                t1.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
		}
		
		synchronized(t2){
            try{
                t2.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
		}
		
		
		synchronized(t3){
            try{
                t3.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
		}
		
		
		synchronized(t4){
            try{
                t4.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
		}
		
	

		
		System.out.println("All threads finished.");
		
		System.out.println("number w/o sync = " + counter.getNumber());
		System.out.println("number with sync = " + syncCounter.getNumber());
		
		
		
		
		
		
		
	}

}
