package practice;



class Point{
	private int x, y;
	public Point()
	{
		this.x = this.y = 0;
		System.out.println("�θ��� Point");
	}
	public Point(int x, int y)
	{
		this.x = x;
		this.y = y;

		System.out.println("�θ��� Point x y");
	}
	public void showPoint()
	{
		System.out.println("(" + x + "," + y + ")");

		System.out.println("�θ��� ShowPoint");
	}
}

class ColorPoint extends Point
{
	private String color;
	public ColorPoint(int x, int y, String color)
	{
		super(x,y);
		this.color = color;

		System.out.println("�ڽ��� ColorPoint");
	}
	
	public void ShowColorPoint()
	{
		System.out.print(color);
		showPoint();

		System.out.println("�ڽ��� ShowPoint");
	}
}



public class SuperEx {

	public static void main(String[] args) {
		ColorPoint cp = new ColorPoint(5,6,"blue");
		cp.ShowColorPoint();

	}

}
