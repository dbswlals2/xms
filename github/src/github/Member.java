package github;

public class Member {//0
   //Member class�� ���� 
   int memberId;
   String memberName;
   int memberPhone;
   String memberEmail;
   
   public Member() {      //�⺻ ������
      
   }
   public Member(int memberid, String membername) {   // ������
      this.memberId = memberid;
      this.memberName = membername;
   }
   
   public Member(int memberid, String membername, int memberphone, String memberemail) {   //������
      this.memberId = memberid;
      this.memberName = membername;
      this.memberPhone = memberphone;
      this.memberEmail = memberemail;
   }
   public void printInFo() {
      System.out.println("name:"+ memberName +" id:" +memberId +" phone:" + memberPhone +" email:" +memberEmail);
   }
}