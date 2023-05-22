package member;

import java.util.Scanner;

import exception.EmailFormatException;

public abstract class InfoMember extends Member {

	public InfoMember(MemberKind kind) {  
		super(kind);
	}
	@Override
	public abstract void getUserInput(Scanner input);
	@Override
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind:" + skind + "name:" + memberName + " id:" + memberId + " phone:" + memberPhone
				+ " email:" + memberEmail);
	}
	public void setMemberEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N') {
			System.out.print("Do you have an email address? (Y/N) ");
			answer = input.next().charAt(0);
			try {
				if (answer == 'y' || answer == 'Y') {
					System.out.print("Member E-mail : ");
					String memberEmail = input.next();
					this.setEmail(memberEmail);
					break;
				} else if (answer == 'n' || answer == 'N') {
					this.setEmail("");
					break;
				} else {

				}
			}
			catch(EmailFormatException e) {
				System.out.println("INcorrect Email Format. put the e-mail address that contains @");

			}
		}


	}

}