import java.util.Scanner;

public class LargeNumber {

	public static void main(String[] args) {
		int[] numbers;
		numbers = new int[3];
		
		Scanner input = new Scanner (System.in);
	
		System.out.println("Please enter 3 numbers:  /n");
		
		for( int counter = 0; counter < numbers.length; counter++) {
			numbers[counter] = input.nextInt();
			
	
			
		}
		
		System.out.printf("%s; %d%n", "smallest number is ", Math.min(numbers[0], Math.min(numbers[1], numbers[2] ) ));
	
		System.out.printf("%s; %d%n", "largest number is ", Math.max(numbers[0], Math.max(numbers[1], numbers[2] ) ));
		
	}


}
