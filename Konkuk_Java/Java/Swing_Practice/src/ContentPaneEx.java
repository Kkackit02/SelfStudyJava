import javax.swing.JButton;
import javax.swing.*;
import java.awt.*;

public class ContentPaneEx extends JFrame {
	public ContentPaneEx()
	{
		setTitle("ContentPane�� JFrame ����"); // Ÿ��Ʋ ����
		//super("Ÿ��Ʋ���ڿ�"); �� ���� ȿ��
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ���� ��ư�� Ŭ���� ��, �����Ӱ� �Բ� ���α׷��� �����Ű�� ���
		
		//System.exit(0); ���α׷� ����
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		// �˾Ƽ� ��ġ ���ִ� ��
		
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("Cancle"));
		contentPane.add(new JButton("Ignore"));
		
		contentPane.add(new JButton("ADD"));
		contentPane.add(new JButton("SUB"));
		contentPane.add(new JButton("MUL"));
		contentPane.add(new JButton("OK"));
		contentPane.add(new JButton("DIV"));
		contentPane.add(new JButton("CALCULATE"));
		
		//add(new JButton("���׽�Ʈ�� ���� �̷��� �׳� �ٷ� �����ӿ� �߰��� �� �� ������ ����õ"));
		
		setSize(800, 1000); // ũ�� ����
		setVisible(true); // �������� ȭ�鿡 ���
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}
	
	

	


}
