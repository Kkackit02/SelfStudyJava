import javax.swing.JFrame;

import java.awt.Container;

import javax.swing.*;

public class MyFrame extends JFrame {

	public MyFrame()
	{
		setTitle("300x300 ���� ������ �����"); // Ÿ��Ʋ ����
		//super("Ÿ��Ʋ���ڿ�"); �� ���� ȿ��
		
		Container contentPane = getContentPane();
		//����Ʈ�� ��������
		
		
		
		setSize(300, 500); // ũ�� ����
		
		setVisible(true); // �������� ȭ�鿡 ���
		
		JButton button = new JButton("Click");
		contentPane.add(button);
	}
	
	public static void main(String[] args) 
	{
		MyFrame mf = new MyFrame();
	}

}


