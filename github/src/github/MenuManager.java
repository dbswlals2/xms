package github;

import java.util.Scanner;

public class MenuManager {
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
				System.out.print("Member ID : ");
				int memberId = input.nextInt();
				System.out.print("Member Name : ");
				String memberName = input.next();
				System.out.print("Member P-Number :");
				int memberPnumber = input.nextInt();
				System.out.print("Member E-mail : ");
				String memberEmail = input.next();
				break;
			case 2:
				
			case 3:
			case 4:
			
			}
			
		}
	}
}
