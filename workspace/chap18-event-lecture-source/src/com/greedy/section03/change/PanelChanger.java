package com.greedy.section03.change;

import javax.swing.JPanel;

public class PanelChanger {

	public static void changePanel(MainFrame mf, JPanel oldPanel, JPanel newPanel) {
		mf.remove(oldPanel);
		mf.add(newPanel);
		mf.repaint();   //화면 새로고침
		mf.revalidate(); //더 강력한 새로고침?
	}
	
	
}
