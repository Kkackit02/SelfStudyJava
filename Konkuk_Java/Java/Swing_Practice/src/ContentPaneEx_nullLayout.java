import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class ContentPaneEx_nullLayout extends JFrame {
	public ContentPaneEx_nullLayout()
	{
		setTitle("ContentPane과 JFrame 예제"); // 타이틀 설정
		//super("타이틀문자열"); 도 같은 효과
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 종료 버튼이 클릭될 때, 프레임과 함께 프로그램을 종료시키는 방법
		
		//System.exit(0); 프로그램 종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		
		
		
		
		contentPane.setLayout(null);
		//contentPane.setLayout(new FlowLayout());
		// 알아서 배치 해주는 툴
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200, 20);
		
		contentPane.add(la);
		
		for (int i = 1; i<= 9; i++)
		{
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i * 15, i * 15);
			b.setSize(50,20);
			contentPane.add(b);
		}
		
		
		//add(new JButton("컨테스트팬 없이 이렇게 그냥 바로 프레임에 추가할 수 도 있지만 미추천"));
		
		setSize(300, 200); // 크기 지정
		setVisible(true); // 프레임을 화면에 출력
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx_nullLayout();
	}

}
