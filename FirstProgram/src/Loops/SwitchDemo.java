package Loops;

public class SwitchDemo {

	public static void main(String[] args) {
		int months = 9;
		
		String monthsName;
		switch(months) {
		case 1: monthsName = "January";
		break;
		case 2: monthsName = "February";
		break;
		case 3: monthsName = "March";
		break;
		case 4: monthsName = "April";
		break;
		case 5: monthsName = "May";
		break;
		case 6: monthsName = "June";
		break;
		case 7: monthsName = "July";
		break;
		case 8: monthsName = "August";
		break;
		case 9: monthsName = "September";
		break;
		case 10: monthsName = "October";
		break;
		default: monthsName= "Invalid Month";
			break;
		}
		System.out.println(monthsName);
		
		int student = 55;
		
		String studentName;
		switch(student) {
		case 1: studentName = "Jeff";
		break;
		case 2: studentName = "John";
		break;
		case 3: studentName = "Donald";
		break;
		case 4: studentName = "Barack";
		break;
		case 5: studentName = "George";
		break;
		default: studentName = "Invalid Name";
		break;
		}
		System.out.println(studentName);
		
		int pets = 5;
		
		String petType;
		switch(pets) {
		case 1: petType = "Dog";
		break;
		case 2: petType = "Cat";
		break;
		case 3: petType = "Tiger";
		break;
		case 4: petType = "Lizard";
		break;
		case 5: petType = "Snake";
		break;
		case 6: petType = "Turtle";
		break;
		case 7: petType = "Shark";
		break;
		case 8: petType = "Anaconda";
		break;
		default: petType = "Invalid Pet";
		}
		System.out.println(petType);

	}

}
