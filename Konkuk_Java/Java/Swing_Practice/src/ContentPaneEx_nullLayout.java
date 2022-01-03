import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;

public class ContentPaneEx_nullLayout extends JFrame {
	public ContentPaneEx_nullLayout()
	{
		setTitle("ContentPane�� JFrame ����"); // Ÿ��Ʋ ����
		//super("Ÿ��Ʋ���ڿ�"); �� ���� ȿ��
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ���� ��ư�� Ŭ���� ��, �����Ӱ� �Բ� ���α׷��� �����Ű�� ���
		
		//System.exit(0); ���α׷� ����
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		
		
		
		
		contentPane.setLayout(null);
		//contentPane.setLayout(new FlowLayout());
		// �˾Ƽ� ��ġ ���ִ� ��
		
		JLabel la = new JLabel("Hello, Press Buttons!");
		la.setLocation(130,50);
		la.setSize(200, 20);
		
		contentPane.add(la);
		
		for (int i = 1; i<= 9; i++)
		{
			JButton b = new JButton(Integer.toString(i));
			b.setLocation(i * 15, i * 15);
			b.setSize(50,20);
			contentPane.add(b);
		}
		
		
		//add(new JButton("���׽�Ʈ�� ���� �̷��� �׳� �ٷ� �����ӿ� �߰��� �� �� ������ ����õ"));
		
		setSize(300, 200); // ũ�� ����
		setVisible(true); // �������� ȭ�鿡 ���
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx_nullLayout();
	}

}
