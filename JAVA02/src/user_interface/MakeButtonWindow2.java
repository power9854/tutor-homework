package user_interface;

import java.awt.*;
import javax.swing.*; 

class ButtonSwingWin extends JFrame {
	ButtonSwingWin(String title) {
	super(title);
	Container ct = getContentPane();
	JButton b = new JButton("Ȯ��");
	ct.add(b); } // ������
}


public class MakeButtonWindow2 {
	public static void main(String[] args) {
		
		ButtonSwingWin win = new ButtonSwingWin("���� ���� ��â");
		win.setSize(300, 250);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

	}
}
