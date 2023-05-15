package member;

import java.util.Scanner;

public class FitnessMember extends Member implements MemberInput {
	protected boolean clothes;

	public FitnessMember(MemberKind kind) {
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

		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an email address? (Y/N) ");
			answer = input.next().charAt(0);
			if (answer == 'y' || answer == 'Y') {
				System.out.print("Member E-mail : ");
				String memberEmail = input.next();
				this.setMemberEmail(memberEmail);
				break;
			} else if (answer == 'n' || answer == 'N') {
				this.setMemberEmail("");
				break;
			} else {
			}
		}

		answer = 'x';
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
		System.out.println("kind:" + skind + " name:" + memberName + " id:" + memberId + " phone:" + memberPhone
				+ " email:" + memberEmail + " clothes:" + clothes);
	}

}