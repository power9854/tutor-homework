package user_interface;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class ButtonEventTest extends JFrame implements ActionListener {
	
	private JLabel result;
	
	public ButtonEventTest() {
		JButton male = new JButton("남자");
		JButton female = new JButton("여자");
		JLabel label = new JLabel("당신의 성별은? ");
		result = new JLabel("");
		
		male.addActionListener(this);
		female.addActionListener(this);
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(male);
		ct.add(female);
		ct.add(label);
		ct.add(result);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		result.setText(s);
	}
	
	
	public static void main(String[] args) {
		ButtonEventTest bet = new ButtonEventTest();
		
		bet.setTitle("ButtonEvent Test");
		bet.setSize(350, 150);
		bet.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bet.setVisible(true);
	}

}
