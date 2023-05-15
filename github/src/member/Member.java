package member;

import java.util.*;

public abstract class Member {// 0
	// Member class�� ����
	protected MemberKind kind = MemberKind.Fitness;
	protected int memberId;
	protected String memberName;
	protected int memberPhone;
	protected String memberEmail;

	public Member() { // �⺻ ������

	}

	public Member(MemberKind kind) { // �⺻ ������
		this.kind = kind;
	}

	public Member(int memberid, String membername) { // ������
		this.memberId = memberid;
		this.memberName = membername;
	}

	public Member(int memberid, String membername, int memberphone, String memberemail) { // ������
		this.memberId = memberid;
		this.memberName = membername;
		this.memberPhone = memberphone;
		this.memberEmail = memberemail;
	}

	public Member(MemberKind kind, int memberid, String membername, int memberphone, String memberemail) { // ������
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