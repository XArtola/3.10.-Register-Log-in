
/**
 * 
 */
import com.zubiri.User.*;
import java.util.Scanner;

/**
 * @author ik013043z1
 *
 */
public class MainMenu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		User user = new User();

		boolean logged = false;
		boolean finish = false;

		while (!finish) {

			System.out.println("Welcome to the log in / register aplication\n" + "What do you want to do?\n"
					+ "\t1- Register\n" + "\t2- Situation\n" + "\t3- Log In\n" + "\t4- Log Out\n" + "\t5- Finish");

			int option = sc.nextInt();
			sc.nextLine();

			switch (option) {

			case 1:

				boolean registered = false;

				while (!registered) {

					System.out.println("Please enter the username and the password you want to use\n");

					switch (user.register(sc.next(), sc.next())) {

					case -2:

						System.out.println("Invalid username, it must only have letters\n");

						break;

					case -1:

						System.out.println(
								"Invalid password, it must have at least a number, a letter, a symbol and a lenght of 8 characters\n");

						break;
					case 0:

						System.out.println("Your username has been registered\n");

						registered = true;

						break;

					case 1:

						System.out.println("Invalid username and password\n" + "\tUsername: it must only have letters\n"
								+ "\tPassword:it must have at least a number, a letter, a symbol and a lenght of 8 characters ");

						break;

					}

				}

			case 2:

				if (logged) {

					System.out.println("You are loged in as " + user.getUsername() + "\n");

				}

				else {

					System.out.println("You are not logged in\n");

				}

				break;

			case 3:

				System.out.println("Please enter the username and the password\n");

				if (user.logIn(sc.next(), sc.next()))

					logged = true;

				System.out.println("You are now loged in as " + user.getUsername() + "\n");
				break;

			case 4:

				logged = false;

				System.out.println("You are now logged out");

				break;

			case 5:

				finish = true;

				break;

			}

		}
	}

}
