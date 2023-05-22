package member;

import java.util.Scanner;

import exception.EmailFormatException;

public interface MemberInput {

	public int getMemberId();
	public void setId(int memberId);
	public void setName(String memberName);
	public void setPhone(int memberPhone);
	public void setEmail(String memberEmail) throws EmailFormatException;
	public void printInfo();
	public void getUserInput(Scanner input);

	public void setMemberId(Scanner input);
	public void setMemberName(Scanner input);
	public void setMemberEmail(Scanner input);
	public void setMemberPhone(Scanner input);
}
