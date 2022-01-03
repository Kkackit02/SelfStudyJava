package practice;
import java.util.Scanner;
import java.util.InputMismatchException;

class A
{
	public A()
	{
		System.out.println("A 생성");
	}
	public A(int x)
	{
		System.out.println("매개변수 생성자 A");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("B 생성");
	}
	public B(int x)
	{
		super(x);
		System.out.println("매개변수 생성자 B");
	}
}

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B(5);
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int n = 0;
		for(int i = 0; i < 2; i++)
		{
			try {
				n = sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("정수가 아닙니다. 다시 입력하세요.");
				sc.next();
				i--;
				continue;
			}
			sum+=n;
		}
		
		System.out.println("합은 : " + sum);
		sc.close();
		
		
		
	}

}
