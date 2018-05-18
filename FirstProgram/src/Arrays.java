
public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Array is a container object which holds a fixed value, the length of array is established when the array is created//
		//once array is created its length is fixed. its value starts from 0//
		//3 steps: 1. declare an array of data type 2. allocate memory 3. Initialize first element
		/*other types of Arrays
		 * byte[] byteArraydemo
		 * short[]
		 * long[]
		 * float[]
		 * double[]
		 * boolean[]
		 * char[]
		 * string[]
		 */
		
	//Step one:
		int [] anArray;
		
	//Step two:	
		
		anArray= new int [5];
		
	//Step 3: 
		
		
		anArray [0]= 100;
		anArray [1]= 87;
		anArray [2]= 55;
		anArray [3]= 99;
		anArray [4]= 68;
		
		System.out.println("Student ID 3 received: " + anArray[2] + "% on final exam.");
		System.out.println("Student ID 1 received:" + anArray[0]);
		System.out.println("Student ID 2 received:" + anArray[1]);
		System.out.println("Student ID 4 received:" + anArray[3]);
		System.out.println("Student ID 5 received:" + anArray[4]);
		
		boolean [] booleanArray;
		booleanArray= new boolean [3];
		
		booleanArray [0] = true;
		booleanArray [1]= false;
		booleanArray [2]= true;
		 
		System.out.println( "The answer to question #1 is " + booleanArray[0] + " because ...");
		System.out.println( "The answer to question #2 is " + booleanArray[1] + " Because ...");
		System.out.println(" The answer to question #3 is " + booleanArray[2] + " because ...");
		
		//another way to do arrays without numbering each array just add **array={};**
		int[] JkArray= {30, 40, 50, 60, 70};
		System.out.println(JkArray[2]);
		
		
		String[] hey= {"hello my name is bob", "my mom is awesome"};
		System.out.println(hey[1]);
		System.out.println(hey[0]);
		
		
	}


}