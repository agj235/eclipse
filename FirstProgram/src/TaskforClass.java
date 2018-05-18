import java.util.Scanner;

public class TaskforClass {

	public static void main(String[] args) {
		Scanner calc = new Scanner(System.in);
		System.out.println("Please enter number from: ");
		int start=calc.nextInt();
		
		System.out.println("Enter number until: ");
		int end= calc.nextInt();
		
		for(int ghi=end; ghi>=start; ghi--) {
			if(ghi%2!=0)  {
			System.out.println( ghi);
		}

	}

}
}
