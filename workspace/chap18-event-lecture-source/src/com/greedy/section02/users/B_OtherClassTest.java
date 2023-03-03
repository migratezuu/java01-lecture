package com.greedy.section02.users;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_OtherClassTest extends JFrame{

	public B_OtherClassTest() {
		this.setSize(300, 200);
		
		JPanel panel = new JPanel();
		JButton button = new JButton("버튼을 눌러보세요");
		JLabel label = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		panel.add(button);
		panel.add(label);
		
		button.addActionListener(new MyEvent(label));  //label에 대한 객체 전달 
		
		JButton button2 = new JButton("새로운 버튼");
		button2.addActionListener(new MyEvent(label));
		
		panel.add(button2);
		
		this.add(panel);
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	
}


class MyEvent implements ActionListener{
	
	private JLabel label;
	
	public MyEvent(JLabel label) {   //label을 받는 생성자
		this.label = label;
	}

	@Override
	public void actionPerformed(ActionEvent e) { 
			//MyEvent가 동작하는 내용 작성
		label.setText("드디어 버튼이 눌러졌습니다.");
		
	}
	
	
}
