package JList_Test;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class ComboActionEx extends JFrame {

	private String [] fruits = {"apple", "banana", "mango"};
	private ImageIcon [] images = { new ImageIcon("images/apple.png"),
			new ImageIcon("images/banana.png"),
			new ImageIcon("images/mango.png")};
	private JLabel imgLabel = new JLabel(images[0]);
	
	public ComboActionEx()
	{
		setTitle("콤보박스 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		JComboBox<String> combo = new JComboBox<String>(fruits);
		c.add(combo);
		c.add(imgLabel);
		
		combo.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
		
	}


	public static void main(String[] args) 
	{
		new ComboActionEx();
	
	}
}
