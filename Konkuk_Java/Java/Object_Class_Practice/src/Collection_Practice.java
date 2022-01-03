import java.util.Iterator;
import java.util.Vector;

public class Collection_Practice {

	public static void main(String[] args) {

		Vector<Integer> v = new Vector<Integer>();
		
		v.add(1);
		v.add(2);
		v.add(-1);
		v.add(2, 100);
		
		
		
		for (int i =0; i < v.size(); i++)
		{
			int n = v.get(i);
			if(n == 100)
			{
				v.remove(i);
				i--;
			}
		}
		
		Iterator<Integer> it = v.iterator();
		
		
		
		
		while(it.hasNext())
		{
			int n = it.next();
			System.out.println(n);
		}
		

	}

}
