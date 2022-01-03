package quiz_202112346;
import java.util.Scanner;

public class quiz_202112346JungGeunNyeong {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String temp = "";
		
		ProgrammingLang[] programmingLang = new ProgrammingLang[3];
		
		
		System.out.print("procedural language: ");
		temp = sc.next();
		ProceduralLang proceduralLang = new ProceduralLang(temp);
		programmingLang[0] = proceduralLang;
		
		System.out.println("이 객체의 클래스는 " + (programmingLang[0] instanceof ProgrammingLang));
		System.out.println("이 객체의 클래스는 " + (programmingLang[0] instanceof ProceduralLang));
		System.out.println("이 객체의 클래스는 " + (programmingLang[0] instanceof ObjectOrientedLang));
		
		System.out.print("object_oriented language: ");
		temp = sc.next();
		ObjectOrientedLang objectOrientedLang = new ObjectOrientedLang(temp);
		programmingLang[1] = objectOrientedLang;
		
		System.out.print("script language: ");
		temp = sc.next();
		ScriptLang scriptLang = new ScriptLang(temp);
		programmingLang[2] = scriptLang;
		
		for(int i = 0; i < 3; i++)
		{
			programmingLang[i].describe();
		}
		
		
		sc.close();


	}

}
