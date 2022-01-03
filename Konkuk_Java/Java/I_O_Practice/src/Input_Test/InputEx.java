package Input_Test;

import java.io.*;

public class InputEx {

	public static void main(String[] args) {
		int c;
		
		try 
		{
			FileReader fin = new FileReader("C:\\test,txt");
			while((c = fin.read()) != -1)
			{
				System.out.print((char)c);
			}

			
			fin.close();
			
		}
		catch(FileNotFoundException e)
		{
			System.out.println("파일을 열 수 없음");
		}
		catch(IOException e)
		{
			System.out.println("입출력 오류");
		}
	}

}
