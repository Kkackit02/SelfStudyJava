package SYnchronuzed_Test;

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter(); // ���� ������ ����
		String [] engText = {
				"Wish men say, ",
				"But I can't help, ",
				"falling in love with you ",
				"Shell we stay? ",
				"Would it be a sin?",
				"If I can't help, ",
				"falling in love with you"};
		
		String [] korText = {"���ع��� ��λ��� ������ �⵵��, ",
				"�ϴ����� �����ϻ� �츮 ���� ����",
				"����ȭ ��õ�� ȭ������",
				"���� ��� �������� ���� �����ϼ�",
				"���� ���� �� �ҳ���, ö���� �θ� ��",
				"�ٶ����� �Һ����� �츮 ����ϼ�.",
				"����ȭ ��õ�� ȭ������,",
				"���� ��� �������� ���� �����ϼ�"};
		
		Thread th1 = new WorkerThread(p, engText);
		Thread th2 = new WorkerThread(p, korText);
	
		th1.start();
		th2.start();
	}
}

class SharedPrinter {
	synchronized void print(String text)
	{
		for(int i = 0; i < text.length(); i++)
		{
			System.out.print(text.charAt(i));
		}
		System.out.println();
	}
}

class WorkerThread extends Thread
{
	private SharedPrinter p;
	private String [] text;
	public WorkerThread(SharedPrinter p, String[] text)
	{
		this.p = p;
		this.text = text;
	}

	@Override
	public void run()
	{
		for(int i = 0; i < text.length; i++)
		{
			p.print(text[i]);
		}
	}
}
