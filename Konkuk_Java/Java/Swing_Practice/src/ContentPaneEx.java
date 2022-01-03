import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx()
	{
		setTitle("ContentPane과 JFrame 예제"); // 타이틀 설정
		//super("타이틀문자열"); 도 같은 효과
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 종료 버튼이 클릭될 때, 프레임과 함께 프로그램을 종료시키는 방법
		
		//System.exit(0); 프로그램 종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		// 알아서 배치 해주는 툴
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		contentPane.add(new JButton("ADD"));
		contentPane.add(new JButton("SUB"));
		contentPane.add(new JButton("MUL"));
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("DIV"));
		contentPane.add(new JButton("CALCULATE"));
		
		//add(new JButton("컨테스트팬 없이 이렇게 그냥 바로 프레임에 추가할 수 도 있지만 미추천"));
		
		setSize(800, 1000); // 크기 지정
		setVisible(true); // 프레임을 화면에 출력
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}
	
	

	


}
