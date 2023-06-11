package github;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;//0

import log.EventLogger;

public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MemberManager memberManager = getObject("membermanager.ser");
		if(memberManager == null) {
			memberManager = new MemberManager(input);
		}
		
		selectMenu(input, memberManager);
		putObject(memberManager, "membermanager.ser");
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
					logger.log("add a Member");
					break;
				case 2:
					memberManager.deleteMember();
					logger.log("delete a Member");
					break;
				case 3:
					memberManager.editMember();
					logger.log("edit a Member");
					break;
				case 4:
					memberManager.viewmembers();
					logger.log("view a list of Member");
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
	public static MemberManager getObject(String filename) {
		MemberManager memberManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			memberManager = (MemberManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return memberManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		return memberManager;
	}
	
	public static void putObject(MemberManager memberManager,String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(memberManager);
			
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}