package member;

import java.util.*;

public class Member {//0
   //Member class의 변수 
	protected MemberKind kind = MemberKind.WorkOut;
	protected int memberId;
	protected String memberName;
	protected int memberPhone;
	protected String memberEmail;
   
   public Member() {      //기본 생성자
      
   }
   public Member(int memberid, String membername) {   // 생성자
      this.memberId = memberid;
      this.memberName = membername;
   }
   
   public Member(int memberid, String membername, int memberphone, String memberemail) {   //생성자
      this.memberId = memberid;
      this.memberName = membername;
      this.memberPhone = memberphone;
      this.memberEmail = memberemail;
   }
   public MemberKind getKind() {
		return kind;
	}
	public void setKind(MemberKind kind) {
		this.kind = kind;
	}
	public int getMemberId() {
		return memberId;
	}
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(int memberPhone) {
		this.memberPhone = memberPhone;
	}
	public String getMemberEmail() {
		return memberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
   
   public void printInFo() {
      System.out.println("name:"+ memberName +" id:" +memberId +" phone:" + memberPhone +" email:" +memberEmail);
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
   
   
   
}