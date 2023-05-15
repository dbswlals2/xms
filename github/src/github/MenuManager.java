package github;

import java.util.Scanner;//0

public class MenuManager {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MemberManager memberManager = new MemberManager(input);
		int num = -1;
		while (num != 5) {
			System.out.println("1. add Member");
			System.out.println("2. delete Member");
			System.out.println("3. edit Member");
			System.out.println("4. view Member");
			System.out.println("5. exit");
			System.out.print("Select one number between 1-5 : ");
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
			case 5:
				continue;

			}

		}
	}
}