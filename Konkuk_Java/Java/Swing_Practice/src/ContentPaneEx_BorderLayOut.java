import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContentPaneEx_BorderLayOut extends JFrame {
	public ContentPaneEx_BorderLayOut()
	{
		setTitle("ContentPane�� JFrame ����"); // Ÿ��Ʋ ����
		//super("Ÿ��Ʋ���ڿ�"); �� ���� ȿ��
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ���� ��ư�� Ŭ���� ��, �����Ӱ� �Բ� ���α׷��� �����Ű�� ���
		
		//System.exit(0); ���α׷� ����
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		
		
		
		
		contentPane.setLayout(new GridLayout(1,10));
		// �˾Ƽ� ��ġ ���ִ� ��
		My2ActionListener listener = new My2ActionListener();
		for (int i = 0; i < 10; i++)
		{
			String text = Integer.toString(i);
			JButton button = new JButton(text);
			button.addActionListener(listener);
			contentPane.add(button);
		}
		
		JButton button = new JButton("Action");
		contentPane.add(button);
		
		/*
		button.addActionListener(new ActionListener() // �͸� �̺�Ʈ ������
		{
			public void actionPerformed(ActionEvent e)
			{
				JButton b = (JButton)e.getSource();
				if(b.getText().equals("Action"))
				{
					b.setText("������ �׼ž��");
					
				}
				else
				{
					b.setText("Action");
				}
			}
		});
		*/
		
		button.addActionListener((e)->
		{
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
			{
				b.setText("������ �׼ž��");
				
			}
			else
			{
				b.setText("Action");
			}
		});
		//���� ���� ���� �͸� �̺�Ʈ ������
		
		//add(new JButton("���׽�Ʈ�� ���� �̷��� �׳� �ٷ� �����ӿ� �߰��� �� �� ������ ����õ"));

		setSize(500, 200); // ũ�� ����
		setVisible(true); // �������� ȭ�鿡 ���
		
	}
	
	private class My2ActionListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent e) 
		{
			JButton b = (JButton)e.getSource();
			if(b.getText().equals("Action"))
			{
				b.setText("�׼�");
			}
			else
			{
				b.setText("Action");
			}
			//InnerClassListener.this.setTitle(b.getText());
		}

	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx_BorderLayOut();
	}
	
}
/* ����Ŭ������ �̺�Ʈ ������ �����
public class MyActionListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action"))
		{
			b.setText("�׼�");
		}
		else
		{
			b.setText("Action");
		}

	}

}
*/