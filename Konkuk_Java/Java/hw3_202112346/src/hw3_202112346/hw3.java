package hw3_202112346;
import java.util.Scanner;
import java.util.Vector;
//�̸� : ���ٳ�
//�й� : 202112346
//���α׷� ���� : [HW#3] Vector Ȱ�� �ǽ� ���� : �ڹ� ���α׷���
//���α׷� �ۼ��� : 2021-11-13


public class hw3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //�Է��� ���� ��ĳ�� ��ü ����
		
		int input_Num = 1;
		Vector<Integer> v = new Vector<Integer>();
		
		
		
		System.out.print("Input numbers: ");
		while(true)
		{
			input_Num = scanner.nextInt();
			if(input_Num == 0)
			{
				break;
			}
			v.add(input_Num);
		}
		
		
		System.out.print("Vector before removal: ");
		for (int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i) + " ");
		}
		
		
		int SearchNum = 0;
		System.out.print("\nSearch number: ");
		SearchNum = scanner.nextInt();
		
		int count = 0;
		
		for (int i = 0; i < v.size(); i++)
		{
			if(v.get(i) == SearchNum)
			{
				v.remove(i);
				count++;
				i--;
			}
		}
		
		System.out.println("# found: " + count);
		System.out.print("Vector after removal: ");
		for (int i = 0; i < v.size(); i++)
		{
			System.out.print(v.get(i) + " ");
		}

		scanner.close();
	}
}
