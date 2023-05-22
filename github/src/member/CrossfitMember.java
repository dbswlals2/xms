package member;

import java.util.Scanner;

public class CrossfitMember extends InfoMember{

	public CrossfitMember(MemberKind kind) { 
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setMemberId(input);
		setMemberName(input);
		setMemberPhone(input);
		setMemberEmailwithYN(input); 

	}
}
