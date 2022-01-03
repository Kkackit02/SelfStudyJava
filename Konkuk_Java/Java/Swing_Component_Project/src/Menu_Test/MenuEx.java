package Menu_Test;

import javax.swing.*;

public class MenuEx extends JFrame {

	public MenuEx()
	{
		setTitle("메뉴 만들기 예제");
		createMenu(); // 메뉴 생성, 프레임에 삽입
		setSize(250, 200);
		setVisible(true);
	}
	
	public void createMenu()
	{
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");
		
		screenMenu.add(new JMenuItem("Load"));
		screenMenu.add(new JMenuItem("Hide"));
		screenMenu.add(new JMenuItem("ReShow"));
		screenMenu.addSeparator();
		screenMenu.add(new JMenuItem("Exit"));
		
		
		mb.add(screenMenu);
		mb.add(new JMenu("Edit"));
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
		setJMenuBar(mb);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuEx();
	}

}
