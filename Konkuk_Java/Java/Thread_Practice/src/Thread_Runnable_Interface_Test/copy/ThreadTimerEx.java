package Thread_Runnable_Interface_Test.copy;

import java.awt.event.*;

import java.awt.*;

import javax.swing.*;

public class ThreadTimerEx extends JFrame {
	
	public ThreadTimerEx()
	{
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		c.add(timerLabel);
		TimerThread runnable = new TimerThread(timerLabel);
		TimerThread th = new Thread(z);
		setSize(250,150);
		setVisible(true);
		th.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ThreadTimerEx();
	}

}
