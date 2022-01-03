package hw2_202112346;
import java.util.Scanner;
// 이름 : 정근녕
// 학번 : 202112346
// 프로그램 설명 : [HW#2] 배열과 반복문 실습 과제 : 자바 프로그래밍
// 프로그램 작성일 : 2021-10-01
public class hw2 {

	public static void main(String[] args) {
		int input_Num = 0;
		int search_Num = 0;
		boolean isResult = false;
		Scanner scanner = new Scanner(System.in);
		//입력을 위한 스캐너 객체 생성
		
		System.out.print("# input: ");
		input_Num = scanner.nextInt();
		
		int[] data_Array = new int[input_Num]; // 입력 값을 저장할 배열 생성
			
		for(int i = 0; i < input_Num; i++) // 입력 값 받기
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
				//반복문 종료, (i + 1 == 검색 횟수)
				break;
			}
		}
		
		if(isResult == false) //위 반복문에서 결과값을 찾지 못했다면 검색 실패 출력
		{
			//err.println -> 빨간색으로 출력(표준 오류 텍스트 색상)
			System.err.println("\"" + search_Num + "\" not found!");
			//System.out.println("\"" + search_Num + "\" not found!");
		}
				
		scanner.close();
	}
}
