
public class arrayReview {

	public static void main(String[] args) {
	
		String[][] practice_1 =new String [10][10];
		
		for (int i=0; i< practice_1.length; i++) {
			for (int j= 0; j< practice_1[i].length; j++) {
				String test= "row" + i + ", column" + j;
				practice_1[i][j] =test;
				
			}
		}
	for(int i=0; i< practice_1.length; i++) {
		for (int j= 0; j< practice_1[i].length; j ++) {
			
			System.out.println(practice_1[i][j] + "              ");
		}
	}
	for(int j=0; j< practice_1.length; j++) {
		for(int i=0; i < practice_1.length; i++) {
			if (j < practice_1[i].length);
			
			System.out.println(practice_1[i][j] + "              ");
		}
	}
	
	
	
	System.out.println();
	}
}
