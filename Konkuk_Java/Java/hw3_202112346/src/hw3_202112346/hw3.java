package hw3_202112346;
import java.util.Scanner;
import java.util.Vector;
//이름 : 정근녕
//학번 : 202112346
//프로그램 설명 : [HW#3] Vector 활용 실습 과제 : 자바 프로그래밍
//프로그램 작성일 : 2021-11-13


public class hw3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //입력을 위한 스캐너 객체 생성
		
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
