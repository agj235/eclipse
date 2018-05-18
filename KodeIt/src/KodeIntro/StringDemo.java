package KodeIntro;

public class StringDemo {

	public static void main(String[] args) {
	//String Literal - String Constant Pool
		String str1 = "Hello";
		
		String str3 = "Hello";
		//This creates an String object - heap
		String str2 = new String("Welcome");
		
		String str4 = new String("Welcome");
		
		//Strings 
		
		str1 = "More Hello";
		
		String stradd = str1 + str2;

	}

}
