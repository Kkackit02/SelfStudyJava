
public class String_Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("C#");
		String b = new String("C++");
		a = a.concat(b); // 문자열 연결
		
		a = a.trim(); //문자열 앞 뒤의 공백 제거
		
		a = a.replace("C#", "C++"); // 문자열 대치
		
		String s[] = a.split(","); // 문자열 분리
		
		a = a.substring(5); // 인덱스 5부터 끝까지 서브 스트링 리턴
		
		char c = a.charAt(2);  // 인덱스 2의 문자 리턴
	
		
		
	}

}
