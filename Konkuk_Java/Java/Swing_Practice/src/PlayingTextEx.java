import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayingTextEx extends JFrame {
	
	private JLabel la = new JLabel("HELLO");
	private JPanel contentPane = new JPanel();
	
	public PlayingTextEx()
	{
		setTitle("�� �� �� �� ���ڿ� �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(null);
		
		c.addKeyListener(new MyKeyAdapter());
		
		
		la.setSize(50,20);
		la.setLocation(30,30);;
		c.add(la);
		
		setSize(500, 200); // ũ�� ����
		setVisible(true); // �������� ȭ�鿡 ���
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	public static void main(String[] args) 
	{
		
		new PlayingTextEx();
	
	}
	
	
	class MyKeyAdapter extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			int keyCode = e.getKeyCode();
			switch(keyCode)
			{
			case KeyEvent.VK_UP:
				la.setLocation(la.getX(), la.getY() - 10);
				break;
			case KeyEvent.VK_DOWN:
				la.setLocation(la.getX(), la.getY() + 10);
				break;
			case KeyEvent.VK_LEFT:
				la.setLocation(la.getX() - 10, la.getY());
				break;
			case KeyEvent.VK_RIGHT:
				la.setLocation(la.getX() + 10, la.getY());
				break;
			}
		}
	}
}
