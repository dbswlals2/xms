package member;

import java.util.*;

public abstract class Member {// 0
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

	public abstract void printInfo();

	

}