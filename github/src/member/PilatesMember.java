package member;

import java.util.Scanner;

public class PilatesMember extends Member implements MemberInput{
	
	public PilatesMember(MemberKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Member ID : ");
		int memberId = input.nextInt();
		this.setMemberId(memberId);

		System.out.print("Member Name : ");
		String memberName = input.next();
		this.setMemberName(memberName);

		System.out.print("Member P-Number : ");
		int memberPhone = input.nextInt();
		this.setMemberPhone(memberPhone);

		System.out.print("Member E-mail : ");
		String memberEmail = input.next();
		this.setMemberEmail(memberEmail);
	}
	
	public void printInfo() {
		String skind = "none";
		switch (this.kind) {
		case Fitness:
			skind = "Fitness";
			break;
		case Crossfit:
			skind = "Corssfit";
			break;
		case Pilates:
			skind = "Pilates";
			break;
		default:
		}
		System.out.println("kind:" + skind + "name:" + memberName + " id:" + memberId + " phone:" + memberPhone
				+ " email:" + memberEmail);
	}

}
