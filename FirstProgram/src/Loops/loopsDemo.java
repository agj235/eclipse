package Loops;

public class loopsDemo {

	public static void main(String[] args) {
		
		
		//Loop allows you to run your code multiple times.
		//For Loop syntax is for(initialize;condition;increment){
		//a=55 is a condition that specifies  how many times
		//p++ is a incrementation that tells you how to count
		int a = 55;
		if(a==33) {
				for(int p=0; p<=10;p++) {
				System.out.println("The value of p is:" +p);
		
				}
		}
		for(int i = 1; i< 30; i=i+ 3) {
			// i+=2 or i=i+2
			//OR you can use if(i%2==0)
			//for odd numbers use if(i%2!=0) 
			System.out.println( "The Value of i is " + i);
		
	}
// print number 1 to 10
		for (int y=1; y<=10; y++) {
			System.out.println(y);
		}
//print number 10 to 1 
		for (int u=10; u>=1; u--) {
			System.out.println(u);
		}
	}
}
