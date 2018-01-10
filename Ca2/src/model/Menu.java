package model;

///**
// * 
// * @author Kevin Power
// * @date 02/05/2017
// */
import java.util.Scanner;

public class Menu {

	/**
	 * Scanner used for input within program
	 */
	public static Scanner sc = new Scanner(System.in);
	private GymApi gymApi = new GymApi();

	public static void main(String[] args) {
		Menu app = new Menu();
		app.printLoop();
	}

	private int mainMenu() {
		System.out.println("l) login");
		System.out.println("r) register");
		System.out.println("m) member");
		System.out.println("t) trainer");
		System.out.print("==>>");
		int option = sc.nextInt();
		return option;

		try {
			// Declare variable for user's option and defaulting to 0
			int menuOption = 0;
			do {
				// Setting menuOption equal to return value from showMenu();
				menuOption = showMenu();

				// Switching on the value given from user
				switch (menuOption) {

				case 1:
					addMember();
					break;
				case 2:
					addTrainer();
					break;
				case 3:
					searchMemberByEmail();
					break;
				case 4:
					printLoop();
					break;
				case 5:
					System.out.println("Quitting Program...");
					break;
				default:
					System.out.println("Sorry, please enter valid Option");

				}// End of switch statement

			} while (menuOption != 5);

			// Exiting message when user decides to quit Program
			System.out.println("Thanks for using this Program...");

		} catch (Exception ex) {
			// Error Message
			System.out.println("Sorry problem occured within Program");
			// flushing scanner
			sc.next();
		} finally {
			// Ensuring that scanner will always be closed and cleaning up
			// resources
			sc.close();
		}

	}// End of main Method

	/**
	 * Method that prints menu to screen and gets returns user's option from
	 * menu
	 * 
	 * @return Returns user Option
	 */
	public static int showMenu() {

		// Declaring var for user option and defaulting to 0
		int option = 0;

		// Printing menu to screen
		System.out.println("l) login");
		System.out.println("r) register");
		System.out.println("m) member");
		System.out.println("t) trainer");
		System.out.println("5. Quit Program");

		// Getting user option from above menu
		System.out.println("Enter Option from above...");
		option = sc.nextInt();

		return option;
	}

}