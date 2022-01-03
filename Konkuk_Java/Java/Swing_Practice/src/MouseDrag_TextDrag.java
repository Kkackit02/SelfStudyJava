import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseDrag_TextDrag extends JFrame 
{
	private JLabel la = new JLabel("Hello");// Ÿ��Ʋ ����
	
	public MouseDrag_TextDrag()
	{
		setTitle("Mouse �̺�Ʈ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ���� ��ư�� Ŭ���� ��, �����Ӱ� �Բ� ���α׷��� �����Ű�� ���
		

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
		
		setSize(500, 200); // ũ�� ����
		setVisible(true); // �������� ȭ�鿡 ���
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
	
	
	public class MyMouseAdapter extends MouseAdapter // �ٸ� �͵��� ���� ���ص� ��
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






