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
			System.out.println("������ �� �� ����");
		}
		catch(IOException e)
		{
			System.out.println("����� ����");
		}
	}

}
