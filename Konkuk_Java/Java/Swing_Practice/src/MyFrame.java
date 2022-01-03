import javax.swing.JFrame;

import java.awt.Container;

import javax.swing.*;

public class MyFrame extends JFrame {

	public MyFrame()
	{
		setTitle("300x300 스윙 프레임 만들기"); // 타이틀 설정
		//super("타이틀문자열"); 도 같은 효과
		
		Container contentPane = getContentPane();
		//컨텐트팬 가져오기
		
		
		
		setSize(300, 500); // 크기 지정
		
		setVisible(true); // 프레임을 화면에 출력
		
		JButton button = new JButton("Click");
		contentPane.add(button);
	}
	
	public static void main(String[] args) 
	{
		MyFrame mf = new MyFrame();
	}

}


