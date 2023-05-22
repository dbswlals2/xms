package member;

import java.util.Scanner;

public class PilatesMember extends Member{

	public PilatesMember(MemberKind kind) {
		super(kind);
	}

	public void getUserInput(Scanner input) {
		setMemberId(input);
		setMemberName(input);
		setMemberPhone(input);
		setMemberEmail(input);    
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " name:" + memberName + " id:" + memberId + " phone:" + memberPhone
				+ " email:" + memberEmail);
	}

}