package practice;
import java.util.Scanner;
import java.util.InputMismatchException;

class A
{
	public A()
	{
		System.out.println("A ����");
	}
	public A(int x)
	{
		System.out.println("�Ű����� ������ A");
	}
}

class B extends A
{
	public B()
	{
		System.out.println("B ����");
	}
	public B(int x)
	{
		super(x);
		System.out.println("�Ű����� ������ B");
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
				System.out.println("������ �ƴմϴ�. �ٽ� �Է��ϼ���.");
				sc.next();
				i--;
				continue;
			}
			sum+=n;
		}
		
		System.out.println("���� : " + sum);
		sc.close();
		
		
		
	}

}
