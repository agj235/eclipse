
public class CallingMethodsFromDifferentClass {

	public static void main(String[] args) {
		allMethods callMethod = new allMethods();
		callMethod.checkOddNumber();
		System.out.println(callMethod.subTwoNumbers(12, 5));
		System.out.println(callMethod.divTwoNumbers(12, 3));
		
		String expected= "Syntax Technologies - Where Knowledge Becomes A Career";
		String actualString=callMethod.expectedString;
		
		if(actualString.equals(expected.trim())) {
			System.out.println("Test case Pass ");}
			else {
				System.out.println("Test case fail");
			}
		}
		
	}


