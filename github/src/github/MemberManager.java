package github;

import java.util.ArrayList;
import java.util.Scanner;

import member.CrossfitMember;
import member.Member;

public class MemberManager {
	ArrayList<Member> members = new ArrayList<Member>();
	Member member;
	Scanner input;
	MemberManager(Scanner input){   //0
		this.input = input;
	}
   
   public void addMember(){
	   
	   int kind = 0;
	   Member member;
	   while(kind != 1 && kind != 2) {
		   System.out.println("1 for WorkOut");
		   System.out.println("2 for Crossfit");
		   System.out.print("Select num for Member Kind between 1 and 2: ");
		   kind = input.nextInt();
		   if(kind == 1) {
			   member = new Member();
			   member.getUserInput(input);
			   members.add(member);
			   break;
		   }
		   else if(kind ==2) {
			   member = new CrossfitMember();
			   member.getUserInput(input);
			   members.add(member);
			   break;
		   }
		   else {
			   System.out.println("Select num for Member Kind between 1 and 2: ");
		   }
	   }
   }   
   public void deleteMember() {
      System.out.print("Member ID : ");
      int memberId = input.nextInt();
      int index = -1;
      for(int i = 0; i<members.size(); i++) {
    	  if(members.get(i).getMemberId() == memberId) {
    		  index = i;
    		  break;
    	  }
      }
      
      if(index >= 0) {
    	  members.remove(index);
    	  System.out.println("the member "+ memberId +" is deleted");  
      }
      else {
    	  System.out.println("the member has not been registered.");
          return;
      }             
   }
   public void editMember() {
	   System.out.println("Member ID: ");
	   int memberId = input.nextInt();
	   for(int i = 0; i<members.size(); i++) {
		   Member member = members.get(i);
		   if(members.get(i).getMemberId() == memberId) {
			   int num = -1;
			   while(num != 5) {
				   System.out.println("1. Edit Id");
				   System.out.println("2. Edit Name");
				   System.out.println("3. Edit Phone");
				   System.out.println("4. Edit Email");
				   System.out.println("5. Exit");
				   System.out.print("Select one number between 1-5 : ");
				   num = input.nextInt();
				   if(num == 1) {
					   System.out.print("Member ID : ");
					   int id = input.nextInt();
					   member.setMemberId(id);
				   }
				   if(num == 2) {
					   System.out.print("Member Name : ");
					   String name = input.next();
					   member.setMemberName(name);
				   }
				   if(num == 3) {
					   System.out.print("Member P-Number : ");
					   int phone = input.nextInt();
					   member.setMemberPhone(phone);
				   }
				   if(num == 4) {
					   System.out.print("Member E-mail : ");
					   String email = input.next();
					   member.setMemberEmail(email);
				   }
				   if(num == 5) {
					   continue;
				   }//if
			   }//while
			   break;
		   }//if
	   }//while
   }
   public void viewmembers() {
//     System.out.print("Member ID : ");
//     int memberId = input.nextInt();
	   System.out.println("# of registered members:" + members.size());
	   for(int i = 0; i<members.size(); i++) {
		   members.get(i).printInFo();
	   }
   }  
}
