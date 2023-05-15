package member;

import java.util.Scanner;

public interface MemberInput {
	
	public int getMemberId();
	public void setMemberId(int memberId);
	public void setMemberName(String memberName);
	public void setMemberPhone(int memberPhone);
	public void setMemberEmail(String memberEmail);
	public void printInfo();
	public void getUserInput(Scanner input);
	

}
