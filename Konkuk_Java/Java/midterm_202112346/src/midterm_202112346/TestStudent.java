/*
 * �̸� : ���ٳ�
 * �а� : ����ƮICT���հ��а�
 * �й� : 202112346
 * ���α׷� ���� : JAVA���α׷��� �߰���� 2��
 * �ۼ� �Ͻ� : 2021-10-18
 */

package midterm_202112346;
import java.util.Scanner;


abstract class Student
{
	private String name; // �ܺο����� ������ setter, getter �޼ҵ�θ� ���� ����

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
		boolean isResult = false; // �˻� ����/���� ���� �˻縦 ���� ���� ����
		
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
		input_Name = sc.nextLine(); //�˻��� name �Է� �� input_Name ��Ȱ��
		
		
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
