import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContentPaneEx_BorderLayOut extends JFrame {
	public ContentPaneEx_BorderLayOut()
	{
		setTitle("ContentPane과 JFrame 예제"); // 타이틀 설정
		//super("타이틀문자열"); 도 같은 효과
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 종료 버튼이 클릭될 때, 프레임과 함께 프로그램을 종료시키는 방법
		
		//System.exit(0); 프로그램 종료
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		
		
		
		
		contentPane.setLayout(new GridLayout(1,10));
		// 알아서 배치 해주는 툴
		My2ActionListener listener = new My2ActionListener();
		for (int i = 0; i < 10; i++)
		{
			String text = Integer.toString(i);
			JButton button = new JButton(text);
			button.addActionListener(listener);
			contentPane.add(button);
		}
		
		JButton button = new JButton("Action");
		contentPane.add(button);
		
		/*
		button.addActionListener(new ActionListener() // 익명 이벤트 리스너
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
				{
					b.setText("마지막 액셔어언");
					
				}
				else
				{
					b.setText("Action");
				}
			}
		});
		*/
		
		button.addActionListener((e)->
		{
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
			{
				b.setText("마지막 액셔어언");
				
			}
			else
			{
				b.setText("Action");
			}
		});
		//람다 식을 통한 익명 이벤트 리스너
		
		//add(new JButton("컨테스트팬 없이 이렇게 그냥 바로 프레임에 추가할 수 도 있지만 미추천"));

		setSize(500, 200); // 크기 지정
		setVisible(true); // 프레임을 화면에 출력
		
	}
	
	private class My2ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
			{
				b.setText("액션");
			}
			else
			{
				b.setText("Action");
			}
			//InnerClassListener.this.setTitle(b.getText());
		}

	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx_BorderLayOut();
	}
	
}
/* 독립클래스로 이벤트 리스너 만들기
public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
		{
			b.setText("액션");
		}
		else
		{
			b.setText("Action");
		}

	}

}
*/