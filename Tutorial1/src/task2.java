import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner hey= new Scanner(System.in) ;
		
		int d=1;
		
		while(d<=3) {
		System.out.println("Please enter month you were born");
		String month=hey.next();
		
		if (month.equals("January") || month.equals("February")|| month.equals("December")) {
			System.out.println("You were born in winter ");
		}else if  (month.equals("March") || month.equals("April")|| month.equals("May")) {
		System.out.println("You were born in Spring");
		} else if  (month.equals("June") || month.equals("July")|| month.equals("August")) {
			System.out.println("You were born in Summer");
		}
		else if  (month.equals("September") || month.equals("October")|| month.equals("November")) {
		System.out.println("You were born in Fall");
		}else {
			System.out.println("Please enter VALID month");
		}
		
d++;
	}
	}
}
