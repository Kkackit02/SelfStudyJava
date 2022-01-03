/*
 * 이름 : 정근녕
 * 학과 : 스마트ICT융합공학과
 * 학번 : 202112346
 * 프로그램 설명 : JAVA프로그래밍 중간고사 2부
 * 작성 일시 : 2021-10-18
 */

package midterm_202112346;
import java.util.Scanner;


abstract class Student
{
	private String name; // 외부에서는 내부의 setter, getter 메소드로만 접근 가능

	void setter(String name)
	{
		this.name = name;
	}
	String getter()
	{
		return this.name;
	}
	
	abstract protected void learn();
}

class SmartICTStudent extends Student
{
	SmartICTStudent(String name)
	{
		this.setter(name);
	}
	
	@Override
	protected void learn()
	{
		System.out.println("learn SmartICT");
	}
}

class CSEStudent extends Student
{
	CSEStudent(String name)
	{
		this.setter(name);
	}
	
	@Override
	protected void learn()
	{
		System.out.println("learn CSE");
	}
}

public class TestStudent {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		Student studentArray[] = new Student[3];
		
		String input_Name;
		String input_Department;
		boolean isResult = false; // 검색 성공/실패 조건 검사를 위한 변수 선언
		
		for(int i = 0; i < studentArray.length; i++)
		{
			System.out.print("name" + i + ": ");
			input_Name = sc.nextLine();
			
			System.out.print("department" + i + ": ");
			input_Department = sc.nextLine();
			
			if(input_Department.equals("SmartICT") )
			{
				studentArray[i] = new SmartICTStudent(input_Name);
			}
			else if(input_Department.equals("CSE"))
			{
				studentArray[i] = new CSEStudent(input_Name);
			}
			else
			{
				System.out.println("wrong department");
				i--;
			}
		}
		
		System.out.print("name for search: ");
		input_Name = sc.nextLine(); //검색할 name 입력 및 input_Name 재활용
		
		
		for(int i = 0; i < studentArray.length; i++)
		{
			if(input_Name.equals(studentArray[i].getter()))
			{
				System.out.println("name : " + studentArray[i].getter());
				studentArray[i].learn();
				
				isResult = true;
			}
		}
		
		if(isResult == false) 
		{
			System.out.println("not found!");
		}
		
		
		sc.close();
	}

}
