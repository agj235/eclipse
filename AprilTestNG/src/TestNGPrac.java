import org.testng.annotations.Test;

public class TestNGPrac {

	
	//annotation
	@Test
	public void sum( ) {
		int a = 10;
		int b = 5;
		int c = a+b;
		System.out.println("Sum of C is: " + c);
	}
	@Test
	public void sub( ) {
		int a = 10;
		int b = 5;
		int c = a-b;
		System.out.println("Sub of C is: " + c);
	}
	@Test
	public void mult( ) {
		int a = 10;
		int b = 5;
		int c = a*b;
		System.out.println("Mult of C is: " + c);
	}
	
}
