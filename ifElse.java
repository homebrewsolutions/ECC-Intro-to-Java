package hello;
import java.util.Scanner;
public class ifElse {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		// Username is user1
		String correctUsername = "user1";
		System.out.println("Enter Username: ");
		String username = scanner.nextLine();
		
		// Password is password
		String correctPassword ="password";
		System.out.println("Enter password: ");
		String password = scanner.nextLine();
		
		if ((correctUsername.equals(username)) && (correctPassword.equals(password))) {
			System.out.println("Log in successful");
		} else {
			System.out.println("Username or password incorrect");
		}
		
		
		
	}

}
