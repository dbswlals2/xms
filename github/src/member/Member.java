package member;

import java.util.*;

import exception.EmailFormatException;

public abstract class Member implements MemberInput {// 0
	// Member class의 변수
	protected MemberKind kind = MemberKind.Fitness;
	protected int memberId;
	protected String memberName;
	protected int memberPhone;
	protected String memberEmail;

	public Member() { // 기본 생성자

	}

	public Member(MemberKind kind) { // 기본 생성자
		this.kind = kind;
	}

	public Member(int memberid, String membername) { // 생성자
		this.memberId = memberid;
		this.memberName = membername;
	}

	public Member(int memberid, String membername, int memberphone, String memberemail) { // 생성자
		this.memberId = memberid;
		this.memberName = membername;
		this.memberPhone = memberphone;
		this.memberEmail = memberemail;
	}

	public Member(MemberKind kind, int memberid, String membername, int memberphone, String memberemail) { // 생성자
		this.kind = kind;
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

	public void setId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setName(String memberName) {
		this.memberName = memberName;
	}

	public int getMemberPhone() {
		return memberPhone;
	}

	public void setPhone(int memberPhone) {
		this.memberPhone = memberPhone;
	}

	public String getMemberEmail() {
		return memberEmail;
	}

	public void setEmail(String memberEmail) throws EmailFormatException {
		if(!memberEmail.contains("@") && !memberEmail.equals("")) {
			throw new EmailFormatException();
		}
		this.memberEmail = memberEmail;
	}

	public abstract void printInfo();

	public void setMemberId(Scanner input) {
		System.out.print("Member ID : ");
		int id = input.nextInt();
		this.setId(id);
	}
	public void setMemberName(Scanner input) {
		System.out.print("Member Name : ");
		String name = input.next();
		this.setName(name);
	}

	public void setMemberEmail(Scanner input) {
		String memberEmail = "";
		while(!memberEmail.contains("@")) {
			System.out.print("Member E-mail : ");
			memberEmail = input.next();
			try {
				this.setEmail(memberEmail);
			} catch (EmailFormatException e) {
				System.out.println("INcorrect Email Format. put the e-mail address that contains @");
			}
		}
	}

	public void setMemberPhone(Scanner input) {
		System.out.print("Member P-Number : ");
		int phone = input.nextInt();
		this.setPhone(phone);
	}
	public String getKindString() {
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
		return skind;
	}

}