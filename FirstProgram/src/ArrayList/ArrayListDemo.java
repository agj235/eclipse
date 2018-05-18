package ArrayList;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList t  = new ArrayList();
		t.add(2000);
		t.add("this is bullcrap");
		t.add(200);
		t.add("Chicken");
		t.add('E');
		t.add("Fake News");
		t.add("Fuck Donald Trump");
		
		System.out.println("The size of t object is: " + t.size());
		
		System.out.print(t);
		System.out.println(t.get(1));
		System.out.println(t.get(5));
		
		

	}

		
		
	}


