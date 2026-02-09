package hello;
import java.util.Scanner;

public class inClass {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First integer: ");
		int num1 =scanner.nextInt();
		
		System.out.print("Enter Second integer: ");
		int num2 = scanner.nextInt();
		
		
		int sum = num1 + num2;
		int difference = num1 - num2;
		int product = num1*num2;
		double quotient =(double) (num1/num2);
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + difference);
		System.out.println("Product: " + product);
		System.out.println("Quotient: " + quotient);

		scanner.close();
		
	
		

	}

}
