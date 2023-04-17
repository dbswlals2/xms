package github;

public class Member {//0
   //Member class의 변수 
   int memberId;
   String memberName;
   int memberPhone;
   String memberEmail;
   
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
   public void printInFo() {
      System.out.println("name:"+ memberName +" id:" +memberId +" phone:" + memberPhone +" email:" +memberEmail);
   }
}