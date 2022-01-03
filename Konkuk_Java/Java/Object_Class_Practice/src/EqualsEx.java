
class Point 
{
	int x, y;
	public Point(int x, int y)
	{
		this.x = x; this.y = y;
	}
	
	public boolean equals(Object obj)
	{
		Point p = (Point)obj;// 다운 캐스팅
		if(x == p.x && y == p.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

class Rect 
{
	int x, y;
	public Rect(int x, int y)
	{
		this.x = x; this.y = y;
	}
	
	public boolean equals(Object obj)
	{
		Rect p = (Rect)obj;// 다운 캐스팅
		if(x*y == p.x * p.y)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}

public class EqualsEx {

	public static void main(String[] args) {
		Point a = new Point(2,3);
		Point b = new Point(2,3);
		Point c = new Point(3,4);
		
		Rect d = new Rect(2,3); // 면적 6
		Rect e = new Rect(2,3); // 면적 6
		Rect f = new Rect(3,4); // 면적 6
		
		if(d.equals(e)) System.out.println("d is equal to e");
		if(d.equals(f)) System.out.println("d is equal to f");
		
		if(a == b) System.out.println("a == b");
		if(a.equals(b)) System.out.println("a is equal to b");
		if(a.equals(c)) System.out.println("a is equal to c");
		
		String java = "java";
		if(java == "java") System.out.println("D");
	}

}
