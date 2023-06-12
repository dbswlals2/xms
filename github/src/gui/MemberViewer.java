package gui;

import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import github.MemberManager;
import member.MemberInput;

public class MemberViewer extends JPanel {

	WindowFrame frame;

	MemberManager memberManager;
	
	public MemberViewer(WindowFrame frame, MemberManager memberManager) {
		this.frame = frame;
		this.memberManager = memberManager;
		
		System.out.println("***" + memberManager.size() + "***");

		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Email");
		model.addColumn("Contact Info.");
		model.addColumn("Necessity of clothes");
		
		for(int i = 0; i<memberManager.size(); i++) {
			Vector row = new Vector();
			MemberInput mi = memberManager.get(i); 
			row.add(mi.getMemberId());
			row.add(mi.getMemberName());
			row.add(mi.getMemberPhone());
			row.add(mi.getMemberEmail());
			model.addRow(row);
		}
		

		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);

		this.add(sp);

	}

}