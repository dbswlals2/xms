package github;

import java.util.InputMismatchException;
import java.util.Scanner;//0

public class MenuManager {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MemberManager memberManager = new MemberManager(input);
		selectMenu(input, memberManager);
	}
	public static void selectMenu(Scanner input, MemberManager memberManager) {
		int num = -1;
		while (num != 5) {
			try {
				showMenu();
				num = input.nextInt();
				switch (num) {
				case 1:
					memberManager.addMember();
					break;
				case 2:
					memberManager.deleteMember();
					break;
				case 3:
					memberManager.editMember();
					break;
				case 4:
					memberManager.viewmembers();
					break;
				default:
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("Please put an integer between 1 and 5!");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
			}
		}
	}
	public static void showMenu() {
		System.out.println("1. add Member");
		System.out.println("2. delete Member");
		System.out.println("3. edit Member");
		System.out.println("4. view Member");
		System.out.println("5. exit");
		System.out.print("Select one number between 1-5 : ");
	}
}