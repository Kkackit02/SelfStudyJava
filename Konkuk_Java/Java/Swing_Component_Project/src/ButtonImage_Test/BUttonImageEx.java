package ButtonImage_Test;


import java.awt.*;
import java.awt.Event.*;
import javax.swing.*;

import JLabel_Test.LabelEx;

public class BUttonImageEx extends JFrame {

	public BUttonImageEx()
	{
		setTitle("이미지버튼 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("images/normalIcon.jpg");
		ImageIcon rolloverIcon = new ImageIcon("images/rolloverIcon.jpg");
		ImageIcon pressedIcon = new ImageIcon("images/PressedIcon.jpg");
		
		JButton btn = new JButton("call~~", normalIcon);
		btn.setPressedIcon(pressedIcon);
		btn.setRolloverIcon(rolloverIcon);
		
		c.add(btn);
		setSize(250, 150);
		setVisible(true);
		
	}


	public static void main(String[] args) 
	{
		new BUttonImageEx();
	
	}
}
