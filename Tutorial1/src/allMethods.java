
public class allMethods {
	String expectedString= "Syntax Technologies - Where Knowledge Becomes A Career";


	public static void main(String[] args) {
	// Classname    variableName          = new className	
		allMethods   callingOtherMethods= new allMethods();
		callingOtherMethods.checkOddNumber();
		callingOtherMethods.sayHello();
		boolean x=callingOtherMethods.isOdd();
		System.out.println(x);
		int y=callingOtherMethods.sumTwoNumbers();
		System.out.println(y);
		System.out.println(callingOtherMethods.subTwoNumbers(12, 5));
		System.out.println(callingOtherMethods.mulTwoNumbers(12, 12));
		System.out.println(callingOtherMethods.divTwoNumbers(12, 3));
		
	}
	
	public void checkOddNumber() {
		int a=10;
		if (a%2!=0) {
			System.out.println(a+ " is an odd number");
			
		}else {
			System.out.println(a+ " is an even number");}
		}
	
	public void sayHello() {
	String a="Calling from inside Method";
	System.out.println(a);}
	
	public boolean isOdd(){
		int a=10;
		if (a%2!=0) {
			return true;
			
		}else {
			return false;
	}
}
	public int sumTwoNumbers() {
		int a=10;
				int b=20;
				int c = a+b;
		return c;
		
	}
	public int subTwoNumbers(int a, int b) {
		return a-b;
	}
	private int mulTwoNumbers(int a, int b) {
		return a*b;
		
	}
	protected int divTwoNumbers(int a, int b) {
		return a/b;
		
	}
}
