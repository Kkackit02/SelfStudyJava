import java.awt.*;
import java.awt.event.*;

import javax.swing.*;



public class Input_Box extends JFrame {

	public JTextField nameField = new JTextField(21);
	public JTextField studentNumField = new JTextField(21);
	
	JLabel nameLabel = new JLabel("�̸�");
	JLabel studentNumLabel = new JLabel("�й�");
	
	private JButton confirmBtn = new JButton("Ȯ��");
	private JButton resetBtn = new JButton("���");
	
	
	
	public Input_Box()
	{
		setTitle("2020 �ڹ� �⸻����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		//c.add(new MyPanel(), BorderLayout.NORTH);
		FlowLayout f = new FlowLayout(FlowLayout.CENTER, 10, 5);
		c.setLayout(f);
		
		
		
		setBackground(Color.LIGHT_GRAY);
		add(nameLabel);
		add(nameField);
		add(studentNumLabel);
		add(studentNumField);

		add(confirmBtn);
		add(resetBtn);
		
		
		ActionListener ConfirmListener = new MessageActionListener(nameField, studentNumField);
		ActionListener ResetListener = new ResetActionListener(nameField, studentNumField);
		
		
		confirmBtn.addActionListener(ConfirmListener);
		resetBtn.addActionListener(ResetListener);
		
		setSize(300, 150);
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Input_Box();
	}

}

class MessageActionListener implements ActionListener {
	
	private JTextField nameField;
	private JTextField studentNumField;
	
	public MessageActionListener(JTextField nf, JTextField stf)
	{
		this.nameField = nf;
		this.studentNumField = stf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String ScreenText = "�̸�: " + nameField.getText() + "\n" +
				"�й�: " + studentNumField.getText();
		
		JOptionPane.showMessageDialog(null, ScreenText, "Message", JOptionPane.INFORMATION_MESSAGE);
	}	

}

class ResetActionListener implements ActionListener {
	
	private JTextField nameField;
	private JTextField studentNumField;
	
	public ResetActionListener(JTextField nf, JTextField stf)
	{
		this.nameField = nf;
		this.studentNumField = stf;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		nameField.setText("");
		studentNumField.setText("");
		
	}	

}