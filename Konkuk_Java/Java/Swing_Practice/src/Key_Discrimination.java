import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Key_Discrimination extends JFrame {

	private JLabel la = new JLabel("<Enter>Ű�� ������ �ٲ�ϴ�.");
	
	public Key_Discrimination()
	{
		setTitle("KeyListener Ȱ�� - �Էµ� ���� Ű �Ǻ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ���� ��ư�� Ŭ���� ��, �����Ӱ� �Բ� ���α׷��� �����Ű�� ���
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);

		
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
	
	
	
	class MyKeyAdapter extends KeyAdapter
	{
		public void keyPressed(KeyEvent e)
		{
			int r = (int) (Math.random() * 256); //red ����
			int g = (int) (Math.random() * 256); //green ����
			int b = (int) (Math.random() * 256); //blue ����
			
			switch(e.getKeyChar())
			{
			case KeyEvent.VK_ENTER: // '\n':
				la.setText("r=" + r+ ", g = " + g + ", b = " + b);
				getContentPane().setBackground(new Color(r,g,b));
				break;
				
			case KeyEvent.VK_Q: // 'q VK_Q �� �빮�ڸ� �ν�'
				System.exit(0);
				
			}
			

		}
	}
	

	public static void main(String[] args) 
	{
		new Key_Discrimination();
	}
}


