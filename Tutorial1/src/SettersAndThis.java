class Frog{
	private String name;
	private int age;
	
	String name1;
	int age1;
	public void setName(String newName) {
		this.name = newName;
	}
	public void setAge(int newAge) {
		age = newAge;
	}
	public String getName() {
		return name;
}
	public int getAge( ) {
		return age;
	}
}
public class SettersAndThis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Frog frog1 = new Frog( );

//frog1.name = "Angelito";
//frog1.age = 1;

frog1.setName("Angelito");
frog1.setAge(4);
System.out.println(frog1.getName());
	 

	}

}
