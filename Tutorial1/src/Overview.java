import java.util.ArrayList;

public class Overview {

	public static void main(String[] args) {
		//How to compare two strings
		
		//String expected = "Welcome to the selenium class";
	//	String actual = "WELCOME TO THE SELENIUM CLASS";
		//1 method
		//System.out.println(expected.equals(actual));
		
		// second method
		//System.out.println(expected.contains(actual));
		// Third Method
		//System.out.println(expected.equalsIgnoreCase(actual));
		//Forth Method
		//System.out.println(expected.compareTo(actual));
		//Fifth Method
		//System.out.println(expected.compareToIgnoreCase(actual));
		//Sixth Method
	//	expected.equals(actual.toLowerCase());
	//	if(expected.compareToIgnoreCase(actual)==0) {
	//		System.out.println("String are the same");
	//	} else {
	//		System.out.println("Strings are not the same.");
//		String toExecute= "Y";
	//	String value= "y";
	//	if(toExecute.equalsIgnoreCase(value.trim())) {
			//System.out.println("EXECUTING SCRIPT");
		//}else {
		//	System.out.println("Test case skipped");
			
		//}
	//HOW TO VERIFY EXISTENCE OF STRING INSIDE THE STRING
		
	//	String actual= "Hello, Jerrytsxm";
		//String toVerify="Jerrytsxm";
		
		//if(actual.contains(actual)) {
		//	System.out.println("String Exist");
	//	}else {
	//		System.out.println("String does not exist");
	//	}
	//Method 2
	//	if(actual.indexOf(toVerify)>0){
	//		System.out.println(actual.indexOf(toVerify));
	//		System.out.println("String exist");
	//	}else {
	//		System.out.println("String does not exist");
	//	}
	
	//HOW TO EXTRACT SUBSTRING FROM A STRING
		
		String actual= "Hello, Jerrytsxm! Welcome to Geico!";
	//STATIC METHOD
	//	System.out.println(actual.substring(7, 16));	
	// System.out.println(actual.substring(7));
	 
	 //DYNAMIC METHOD
	String[] words= actual.split(" ");
	//System.out.println(words.length);
	//System.out.println(words[1]);
	//System.out.println(words[1].replace("!", ""));
	
	for(int i=0; i<words.length; i++) {
		
	System.out.println(words[i]);
	}
		//FOR EACH - WORKS WITH COLLECTION//ADVANCED-ENHANCED
	for(String word: words) {
		System.out.println(word);
	}
	
	ArrayList<String> myList=new ArrayList();
	myList.add("Jon");
	myList.add("Susan");
	myList.add("Jorge");
	myList.add("Shuan");
	//System.out.println(myList.get(1));
//	System.out.println(myList.size());
	
	for(Object value: myList) {
		System.out.println(value);
		
	}
	}
	
	
	
	
	}


