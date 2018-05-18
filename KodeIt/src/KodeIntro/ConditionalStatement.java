package KodeIntro;

public class ConditionalStatement {

	public static void main(String[] args) {
		int score = 91;
		String myGrade;
		if (score > 90) {
			myGrade = "A";
		}
		else if (score > 80 ) {
			myGrade= "B";
		}
		else {
			myGrade= "C";
		}
		System.out.println("Score is: " + score);
		System.out.println("Grade is: " + myGrade);
	}

}
