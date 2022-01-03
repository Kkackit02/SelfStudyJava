package CheckBox_Test;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import CheckBox_Test.CheckBoxEx.MyItemListener;

public class JRadioButtonEx extends JFrame {
	
	private JRadioButton [] fruits = new JRadioButton[3];
	private JLabel label = new JLabel("선택 되지 않았습니다.");
	private String [] names = {"사과", "배", "체리"};
	
	public JRadioButtonEx()
	{
		setTitle("라디오 버튼 만들기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		
		ButtonGroup g = new ButtonGroup();
		
		
		JRadioButton apple = new JRadioButton("사과");


		JRadioButton pear = new JRadioButton("배", true);


		JRadioButton cherry = new JRadioButton("체리");


		
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
					label.setText("사과 선택");;
				}
				else if (e.getItem() == names[1])
				{
					label.setText("배 선택");;
				}
				else
				{
					label.setText("체리 선택");;
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
