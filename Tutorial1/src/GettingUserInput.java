import java.util.Scanner;

public class GettingUserInput {

	public static void main(String[] args) {
		
		//Create scanner object
		Scanner input = new Scanner(System.in);
		// Output the project
		System.out.println("Enter a line of text");
		//wait for the user to enter a line of text
		String Line = input.nextLine();
		//Tell them what they entered.
		System.out.println("You enter: " + Line);

	}

}
