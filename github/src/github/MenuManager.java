package github;

import java.util.Scanner;

public class MenuManager {
	public static void addMember(){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Member ID : ");
		int memberId = input.nextInt();
		System.out.print("Member Name : ");
		String memberName = input.next();
		System.out.print("Member P-Number : ");
		int memberPhone = input.nextInt();
		System.out.print("Member E-mail : ");
		String memberEmail = input.next();
	}	
	public static void deleteMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member ID : ");
		int memberId = input.nextInt();
	}
	public static void editMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member ID : ");
		int memberId = input.nextInt();
	}
	public static void viewMember() {
		Scanner input = new Scanner(System.in);
		System.out.print("Member ID : ");
		int memberId = input.nextInt();
	}
	public static void Menu() {
		
	}
	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num != 6) {
			System.out.println("1. add Member");
			System.out.println("2. delete Member");
			System.out.println("3. edit Member");
			System.out.println("4. view Member");
			System.out.println("5. show a Menu");
			System.out.println("6. exit");
			System.out.print("Select one number between 1-6 : ");
			num = input.nextInt();
			
			switch (num)
			{
			case 1:
				addMember();
				break;
			case 2:
				deleteMember();
				break;
			case 3:
				editMember();
				break;
			case 4:
				viewMember();
				break;
			case 5:
				continue;
			
			}
			
		}
	}
}
