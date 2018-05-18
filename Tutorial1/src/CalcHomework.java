import java.util.Scanner;

public class CalcHomework {

	public static void main(String[] args) {
		//Please write script to create: 
		//CALCULATOR LOGIC WITH 2 NUMBERS:
			//User is able to enter 2 numbers
			//User is able to enter one of these operators:  +, 
			//- 
			//, / , *
			//Program needs to perform the operation and display the result
		
		
		
		
		
		
		
		Scanner yoMama = new Scanner(System.in);
		int fnum, snum;
		char operator;
		System.out.println(" Enter fnum : ");
		fnum= yoMama.nextInt();
		System.out.println(" Enter snum : ");
		snum= yoMama.nextInt();
		System.out.println("Enter operator (+,-,*,/)");
		operator= yoMama.next().charAt(0);
		double addition= fnum+snum;
		double subtraction= fnum-snum;
		double multiplication=fnum*snum;
		double division=fnum/snum;
		
		switch(operator)
		{
		case '+':
		{
			System.out.println("Total after Addition is : " + addition);
		break;}
		
			case '-':
			{
				System.out.println("Total after Subtraction is : " + subtraction);
				break;}
				
					case'*':
					{
						System.out.println("Total after Multiplication is : " + multiplication);
		break;}
					case'/':
					{
						System.out.println("Total after Dvivision is : " + division);
						break;}
					default:
					{
						System.out.println("Please select proper operator");
						break;
					}
					
		}
		}
	
		

	}


