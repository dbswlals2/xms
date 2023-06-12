package member;

import java.util.Scanner;

import exception.EmailFormatException;

public interface MemberInput {
	
	public void setId(int memberId);
	public int getMemberId();
	
	public void setName(String memberName);
	public String getMemberName();
	
	public void setPhone(int memberPhone);
	public int getMemberPhone();
	
	public void setEmail(String memberEmail) throws EmailFormatException;
	public String getMemberEmail();
	
	public void printInfo();
	public void getUserInput(Scanner input);

	public void setMemberId(Scanner input);
	public void setMemberName(Scanner input);
	public void setMemberEmail(Scanner input);
	public void setMemberPhone(Scanner input);
}
