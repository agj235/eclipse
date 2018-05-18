package KodeIntro;

public class Variables {

	public static void main(String[] args) {
	/*
	 * Byte
	 * min: -128
	 * max:127
	 * default:0
	 */
		byte byteVariable = 100;
		System.out.println("BYTE VALUE" +byteVariable);
		
		/*
		 * Short
		 * min: -32,768
		 * max:32,767
		 * default: 0 
		 */
		short shortVariable = 1000;
		System.out.println("short value: " + shortVariable);
		
		/*
		 * int
		 * min: -2,147,483,648
		 * max: 2,147,483,647
		 * Default; 0 
		 */
		int integerVariable = 100000;
		System.out.println("Int value: " + integerVariable);
		
		/*
		 * long
		 * min: -2^63
		 * Max: 2^63 -1
		 * Default: 0
		 */
		long longVariable = 100000000L;
		System.out.println("Long value" + longVariable);
		
		/*
		 * float
		 * Default: 0.0f
		 */
		float floatVariable = 20.0f;
		System.out.println("Float value:" + floatVariable);
		
		/*
		 * double
		 * default: 0.0d
		 */
		double doubleVariable = 60.33;
		System.out.println("Double value: " + doubleVariable);
		
		/*
		 * boolean
		 * false and true
		 * default: false
		 */
		boolean booleanVariable = true;
		System.out.println("Boolean value: " + booleanVariable);
		/*
		 * char
		 * min:0
		 * max: 65,535
		 */
		char charVariable = 'a';
		System.out.println("char value: "+ charVariable);}

}
