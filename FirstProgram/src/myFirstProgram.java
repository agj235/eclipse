
public class myFirstProgram {
//GLOBAL VALUES
	int abc= 10;
	int def= 20;
	static String ghj="My name is Pablo";
	public static void main(String[] args) {
		
myFirstProgram obj = new myFirstProgram();
obj.sum();
obj.sub();
System.out.println(obj.abc);
System.out.println(obj.def);
System.out.println(ghj);
}
public void sum() {
	int a = 100;
	int b = 200;
	int c = a+b;
	System.out.println("The value of c is: " + c);
}
public void sub() {
	int a =20;
	int b = 30;
	int c = b-a;
	System.out.println("The value of c  is: " + c);
}
}
