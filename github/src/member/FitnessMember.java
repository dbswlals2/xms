package member;

import java.util.Scanner;

public class FitnessMember extends InfoMember {
	protected boolean clothes;

	public FitnessMember(MemberKind kind) {
		super(kind);
	}
	public void setMemberId(MemberInput member, Scanner input) {
		System.out.print("Member ID : ");
		int id = input.nextInt();
		member.setId(id);
	}
	public void setMembername(MemberInput member, Scanner input) {
		System.out.print("Member Name : ");
		String name = input.next();
		member.setName(name);
	}

	public void getUserInput(Scanner input) {
		setMemberId(input);
		setMemberName(input);
		setMemberPhone(input);
		setMemberEmailwithYN(input); 

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have clothes? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				this.clothes = true;
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.clothes = false;
				break;
			} else {
			}
		}
	}

	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + " name:" + memberName + " id:" + memberId + " phone:" + memberPhone
				+ " email:" + memberEmail + " clothes:" + clothes);
	}

}