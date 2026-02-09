package hello;
import java.util.Scanner; // Importing scanner method
public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initizaling scanner
        System.out.print("Enter a number: "); 
        int num = scanner.nextInt(); // Storing next interger from the user as interger 'num'
        scanner.close(); // Closing the scanner method

        // Conditional Statemnent checking to see if the number input by user is even or odd 
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
    }
}

