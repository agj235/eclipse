package oopsConcepts;

public class addingMethods {
	
	public static void main(String[] args) {
		//Void means Nothing
		String grade;
		String studentName;  
		
		studentName = "John";
		grade = findGrades(90);
		displayGrades(studentName, grade);
		
		grade = findGrades(45);
		displayGrades("Jack", grade);
		grade = findGrades(80);
		displayGrades("Stephanie", grade);
		grade = findGrades(70);
		displayGrades("Tiffany", grade);
		
		}
	
	public static String findGrades( int score) {
		String grade;
		if (score >= 90 && score <= 100) {
			grade = "A";
		}else if (score >= 80 && score <=90) {
			grade = "B";
		} else if (score >= 70 && score <=80) {
			grade = "C";
		} else {
			grade = "D";
		}
		return grade;
}
	public static  void displayGrades(String studentName, String grade) {
		System.out.println("*************************");
		System.out.println("Grade of " + studentName + " is: " + grade);
		System.out.println("*************************");
	}
}
