package github;

import java.util.Scanner;

public class MemberManager {
   Member member;
   Scanner input;
   
   MemberManager(Scanner input){   //0
      this.input = input;
   }
   
   public void addMember(){
      member = new Member();
      System.out.print("Member ID : ");
      member.memberId = input.nextInt();
      System.out.print("Member Name : ");
      member.memberName = input.next();
      System.out.print("Member P-Number : ");
      member.memberPhone = input.nextInt();
      System.out.print("Member E-mail : ");
      member.memberEmail = input.next();
   }   
   public void deleteMember() {
      System.out.print("Member ID : ");
      int memberId = input.nextInt();
      if(member==null) {
         System.out.println("the member has not been registered.");
         return;
      }
      if(member.memberId== memberId) {
         member=null;
         System.out.println("the member is deleted");
      }
   }
   public void editMember() {
      System.out.print("Member ID : ");
      int memberId = input.nextInt();
      if(member.memberId== memberId) {
         System.out.println("the member to be edited is "+memberId);
      }
   }
   public void viewMember() {
      System.out.print("Member ID : ");
      int memberId = input.nextInt();
      if(member.memberId == memberId) {
         member.printInFo();
      } 
   } 
}