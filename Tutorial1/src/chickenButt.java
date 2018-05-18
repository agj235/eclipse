import java.util.Scanner;

public class chickenButt {

	public static void main(String[] args) {
		Scanner guess = new Scanner(System.in);
		
		int abc =0;
		int mynumber=18;
		
		do {
			System.out.println("Guess the secret number between 1 and 20");
			abc= guess.nextInt();
			
			if (abc< mynumber) {
				System.out.println("Your number is too small");
			}
			else if (abc>mynumber ) {
				System.out.println("Your number is too large");}
		}
				while (abc != mynumber);{
				System.out.println("Congratulations Dumbass You Got It :D!!! ");
			
}
}}
	


