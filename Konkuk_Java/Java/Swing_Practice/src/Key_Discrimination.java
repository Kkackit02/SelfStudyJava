import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Key_Discrimination extends JFrame {

	private JLabel la = new JLabel("<Enter>키로 배경색이 바뀝니다.");
	
	public Key_Discrimination()
	{
		setTitle("KeyListener 활용 - 입력된 문자 키 판별");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 종료 버튼이 클릭될 때, 프레임과 함께 프로그램을 종료시키는 방법
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);

		
		MyKeyAdapter keyAdapter = new MyKeyAdapter();
		contentPane.addKeyListener(keyAdapter);
		
		contentPane.setFocusable(true);
		contentPane.requestFocus();
		
		
		la.setSize(50,20);
		la.setLocation(30,30);;
		contentPane.add(la);
		
		setSize(500, 200); // 크기 지정
		setVisible(true); // 프레임을 화면에 출력
	}
	
	
	
	class MyKeyAdapter extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			int r = (int) (Math.random() * 256); //red 성분
			int g = (int) (Math.random() * 256); //green 성분
			int b = (int) (Math.random() * 256); //blue 성분
			
			switch(e.getKeyChar())
			{
			case KeyEvent.VK_ENTER: // '\n':
				la.setText("r=" + r+ ", g = " + g + ", b = " + b);
				getContentPane().setBackground(new Color(r,g,b));
				break;
				
			case KeyEvent.VK_Q: // 'q VK_Q 는 대문자만 인식'
				System.exit(0);
				
			}
			

		}
	}
	

	public static void main(String[] args) 
	{
		new Key_Discrimination();
	}
}



