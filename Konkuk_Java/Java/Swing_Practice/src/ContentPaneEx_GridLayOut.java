import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class ContentPaneEx_GridLayOut extends JFrame {
	public ContentPaneEx_GridLayOut()
	{
		setTitle("ContentPane과 JFrame 예제"); // 타이틀 설정
		//super("타이틀문자열"); 도 같은 효과
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 종료 버튼이 클릭될 때, 프레임과 함께 프로그램을 종료시키는 방법
		
		//System.exit(0); 프로그램 종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		
		
		
		contentPane.setLayout(new BorderLayout(30,20));
		// 알아서 배치 해주는 툴
		

		contentPane.add(new JButton("ADD"), BorderLayout.WEST);
		contentPane.add(new JButton("SUB"), BorderLayout.CENTER);
		contentPane.add(new JButton("MUL"), BorderLayout.EAST);
		contentPane.add(new JButton("DIV"), BorderLayout.NORTH);
		contentPane.add(new JButton("CALCULATE"), BorderLayout.SOUTH);
		
		
		
		
		//add(new JButton("컨테스트팬 없이 이렇게 그냥 바로 프레임에 추가할 수 도 있지만 미추천"));
		
		setSize(400, 400); // 크기 지정
		setVisible(true); // 프레임을 화면에 출력
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx_GridLayOut();
	}

}
