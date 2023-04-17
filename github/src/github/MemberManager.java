package github;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberManager {
	ArrayList<Member> members = new ArrayList<Member>();
	Member member;
	Scanner input;
	MemberManager(Scanner input){   //0
		this.input = input;
	}
   
   public void addMember(){
	   Member member = new Member();
	   System.out.print("Member ID : ");
	   member.memberId = input.nextInt();
	   System.out.print("Member Name : ");
	   member.memberName = input.next();
	   System.out.print("Member P-Number : ");
	   member.memberPhone = input.nextInt();
	   System.out.print("Member E-mail : ");
	   member.memberEmail = input.next();
	   members.add(member);
   }   
   public void deleteMember() {
      System.out.print("Member ID : ");
      int memberId = input.nextInt();
      int index = -1;
      for(int i = 0; i<members.size(); i++) {
    	  if(members.get(i).memberId == memberId) {
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
		   if(members.get(i).memberId == memberId) {
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
					   member.memberId = input.nextInt();
				   }
				   if(num == 2) {
					   System.out.print("Member Name : ");
					   member.memberName = input.next();
				   }
				   if(num == 3) {
					   System.out.print("Member P-Number : ");
					   member.memberPhone = input.nextInt();
				   }
				   if(num == 4) {
					   System.out.print("Member E-mail : ");
					   member.memberEmail = input.next();
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
	   for(int i = 0; i<members.size(); i++) {
		   members.get(i).printInFo();
	   }
   }  
}
