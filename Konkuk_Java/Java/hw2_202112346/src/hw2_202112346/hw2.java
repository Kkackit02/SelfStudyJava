package hw2_202112346;
import java.util.Scanner;
// �̸� : ���ٳ�
// �й� : 202112346
// ���α׷� ���� : [HW#2] �迭�� �ݺ��� �ǽ� ���� : �ڹ� ���α׷���
// ���α׷� �ۼ��� : 2021-10-01
public class hw2 {

	public static void main(String[] args) {
		int input_Num = 0;
		int search_Num = 0;
		boolean isResult = false;
		Scanner scanner = new Scanner(System.in);
		//�Է��� ���� ��ĳ�� ��ü ����
		
		System.out.print("# input: ");
		input_Num = scanner.nextInt();
		
		int[] data_Array = new int[input_Num]; // �Է� ���� ������ �迭 ����
			
		for(int i = 0; i < input_Num; i++) // �Է� �� �ޱ�
		{
			System.out.print("input[" + i + "]: ");
			data_Array[i] = scanner.nextInt();
		}
		
		System.out.print("search word: ");
		search_Num = scanner.nextInt();
		
		for(int i = 0; i < input_Num; i++)
		{
			if(data_Array[i] == search_Num)
			{
				System.out.println("\"" + search_Num + "\" found " + (i + 1) + " times.");
				isResult = true;
				//�ݺ��� ����, (i + 1 == �˻� Ƚ��)
				break;
			}
		}
		
		if(isResult == false) //�� �ݺ������� ������� ã�� ���ߴٸ� �˻� ���� ���
		{
			//err.println -> ���������� ���(ǥ�� ���� �ؽ�Ʈ ����)
			System.err.println("\"" + search_Num + "\" not found!");
			//System.out.println("\"" + search_Num + "\" not found!");
		}
				
		scanner.close();
	}
}
