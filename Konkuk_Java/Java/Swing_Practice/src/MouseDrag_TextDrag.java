import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDrag_TextDrag extends JFrame 
{
	private JLabel la = new JLabel("Hello");// 타이틀 설정
	
	public MouseDrag_TextDrag()
	{
		setTitle("Mouse 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//프레임 종료 버튼이 클릭될 때, 프레임과 함께 프로그램을 종료시키는 방법
		

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		
		//MyMouseListener listener = new MyMouseListener();
		//contentPane.addMouseListener(listener);
		
		
		MyMouseAdapter mouseAdapter = new MyMouseAdapter();
		contentPane.addMouseListener(mouseAdapter);
		contentPane.setLayout(null);
		
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
	

	public class MyMouseListener implements MouseListener
	{
		public void mousePressed(MouseEvent e)
		{
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
			
		}
		
		public void mouseReleased(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseExited(MouseEvent e) {}
	}
	
	
	public class MyMouseAdapter extends MouseAdapter // 다른 것들은 구현 안해도 됌
	{
		public void mousePressed(MouseEvent e)
		{
			int x = e.getX();
			int y = e.getY();
			la.setLocation(x,y);
		}
	}
	
	
	public class MyKeyAdapter extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			la.setText("Push");
		}
		public void keyReleased(KeyEvent e)
		{
			la.setText("Hello");
		}
	}
	
	
	
	public static void main(String[] args)
	{
		new MouseDrag_TextDrag();
		
	}
}






