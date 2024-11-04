package user_interface;

import java.awt.*;
import javax.swing.*; 

class ButtonSwingWin extends JFrame {
	ButtonSwingWin(String title) {
	super(title);
	Container ct = getContentPane();
	JButton b = new JButton("확인");
	ct.add(b); } // 생성자
}


public class MakeButtonWindow2 {
	public static void main(String[] args) {
		
		ButtonSwingWin win = new ButtonSwingWin("내가 만든 새창");
		win.setSize(300, 250);
		win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		win.setVisible(true);

	}
}
