package syntaxReview;

public class Review1 {

	public static void main(String[] args) {
		
		
		boolean a = true;
		boolean b=4>5;
		System.out.println(a);
		System.out.println(b);
		
		
		String expectedString="You may qualify for a multi-policy discount!";
		String abc=" You may qualify for a multi-policy discount!  ";
		System.out.println(abc.length());
		System.out.println(abc);
		System.out.println(expectedString);
		String myNewString=abc.trim();
		System.out.println(myNewString.length());
		System.out.println(abc.trim());
		
		int c= 15;
				int d=3;
				System.out.println(c%d);
				
				int f=10;
					if(f==11) {
					System.out.println("hello");
					} else {
						System.out.println("goodbye");
					}
					
					int g =33;
					
						if(g%2==0) {
							System.out.println("even");
						} else {
							System.out.println("odd");
						}
				
	}

}
