import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class ContentPaneEx_GridLayOut extends JFrame {
	public ContentPaneEx_GridLayOut()
	{
		setTitle("ContentPane�� JFrame ����"); // Ÿ��Ʋ ����
		//super("Ÿ��Ʋ���ڿ�"); �� ���� ȿ��
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//������ ���� ��ư�� Ŭ���� ��, �����Ӱ� �Բ� ���α׷��� �����Ű�� ���
		
		//System.exit(0); ���α׷� ����
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.ORANGE);
		
		
		
		contentPane.setLayout(new BorderLayout(30,20));
		// �˾Ƽ� ��ġ ���ִ� ��
		

		contentPane.add(new JButton("ADD"), BorderLayout.WEST);
		contentPane.add(new JButton("SUB"), BorderLayout.CENTER);
		contentPane.add(new JButton("MUL"), BorderLayout.EAST);
		contentPane.add(new JButton("DIV"), BorderLayout.NORTH);
		contentPane.add(new JButton("CALCULATE"), BorderLayout.SOUTH);
		
		
		
		
		//add(new JButton("���׽�Ʈ�� ���� �̷��� �׳� �ٷ� �����ӿ� �߰��� �� �� ������ ����õ"));
		
		setSize(400, 400); // ũ�� ����
		setVisible(true); // �������� ȭ�鿡 ���
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx_GridLayOut();
	}

}
