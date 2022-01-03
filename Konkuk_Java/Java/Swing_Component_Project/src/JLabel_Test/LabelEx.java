package JLabel_Test;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LabelEx extends JFrame 
{
	public LabelEx()
	{
		setTitle("���̺� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		
		JLabel textLabel = new JLabel("���ӽ� ���� �Դϴ�!");
		
		ImageIcon img = new ImageIcon("images/gosling.jpg");
		JLabel imageLabel = new JLabel(img);
		
		ImageIcon icon = new ImageIcon("images/icon.gif");
		JLabel label = new JLabel("Ŀ�� ���� �ϽǷ���, ��ȭ���̼�", icon, SwingConstants.CENTER);
		
		c.add(textLabel);
		c.add(imageLabel);
		c.add(label);
		
		
		
		setSize(300, 500);
		setVisible(true);
		
	}


	public static void main(String[] args) 
	{
		new LabelEx();
	
	}

}
