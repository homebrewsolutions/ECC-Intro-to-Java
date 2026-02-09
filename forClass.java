package hello;
import java.util.Scanner;

public class forClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Username: ");
		String userName = scanner.nextLine();
		System.out.println("Create Password: ");
		String password = scanner.nextLine();
		System.out.println("Username: "+ userName + " | Password: " + password);
		
		
		
	}

}
