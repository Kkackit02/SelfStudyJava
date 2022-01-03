package CheckBox_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import CheckBox_Test.CheckBoxEx.MyItemListener;

public class JRadioButtonEx extends JFrame {
	
	private JRadioButton [] fruits = new JRadioButton[3];
	private JLabel label = new JLabel("���� ���� �ʾҽ��ϴ�.");
	private String [] names = {"���", "��", "ü��"};
	
	public JRadioButtonEx()
	{
		setTitle("���� ��ư ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		
		ButtonGroup g = new ButtonGroup();
		
		
		JRadioButton apple = new JRadioButton("���");


		JRadioButton pear = new JRadioButton("��", true);


		JRadioButton cherry = new JRadioButton("ü��");


		
		g.add(apple);

		g.add(pear);

		g.add(cherry);
		
		
		c.add(apple);
		c.add(pear);
		c.add(cherry);
		
		c.add(label);
		
		setSize(250, 150);
		setVisible(true);
		
	}
	
	/*
	class MyItemListener implements ItemListener
	{

		public void itemStateChanged(ItemEvent e)
		{
			if(e.getStateChange() == ItemEvent.SELECTED)
			{
				if(e.getItem() == names[0])
				{
					label.setText("��� ����");;
				}
				else if (e.getItem() == names[1])
				{
					label.setText("�� ����");;
				}
				else
				{
					label.setText("ü�� ����");;
				}
			}
			else
			{
				
			}

		}
	}
	*/
	

	public static void main(String[] args) 
	{
		new JRadioButtonEx();
	
	}

}
