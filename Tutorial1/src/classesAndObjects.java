class Person{
	
	
	
	// Instance variables (data or "state"
	String name;
	int age;
	//Classes can contain
	// 1. Data
	// 2. Subroutines (methods)
	void speak( ) {
		for(int i=0; i<3; i++) {
		System.out.println("My name is : " + name + " and i am " + age + " years old. ");
	}
}
	void sayHello() {
		System.out.println("Hello there");
	}
}
public class classesAndObjects {

	public static void main(String[] args) {
		Person person1 = new Person();
person1.name = "Angel Jimenez";
person1.age = 25;
person1.speak();
person1.sayHello();



Person person2 = new Person();
person2.name = "Joe Biggs";
person2.age = 100;
	
System.out.println(person1.name);
System.out.println(person2.age);
}
}