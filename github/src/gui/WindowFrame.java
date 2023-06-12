package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import github.MemberManager;

public class WindowFrame extends JFrame {

	MemberManager memberManager;
	
	MenuSelection menuSelection;
	MemberAdder memberadder;
	MemberViewer memberviewer;
	

	public WindowFrame(MemberManager memberManager) {
		
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");
		
		this.memberManager = memberManager;
		this.menuSelection = new MenuSelection(this);
		this.memberadder = new MemberAdder(this);
		this.memberviewer = new MemberViewer(this, this.memberManager);
		

		this.add(menuSelection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuSelection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuSelection = menuselection;
	}

	public MemberAdder getAdder() {
		return memberadder;
	}

	public void setAdder(MemberAdder adder) {
		this.memberadder = adder;
	}

	public MemberViewer getViewer() {
		return memberviewer;
	}

	public void setViewer(MemberViewer viewer) {
		this.memberviewer = viewer;
	}

}