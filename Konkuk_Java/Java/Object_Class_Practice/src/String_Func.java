
public class String_Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("C#");
		String b = new String("C++");
		a = a.concat(b); // ���ڿ� ����
		
		a = a.trim(); //���ڿ� �� ���� ���� ����
		
		a = a.replace("C#", "C++"); // ���ڿ� ��ġ
		
		String s[] = a.split(","); // ���ڿ� �и�
		
		a = a.substring(5); // �ε��� 5���� ������ ���� ��Ʈ�� ����
		
		char c = a.charAt(2);  // �ε��� 2�� ���� ����
	
		
		
	}

}
