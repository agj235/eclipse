import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExercise {
@Test(dataProvider="credentials")
	public void practice(String username, String password, int age, String DOB) {
		System.out.println("The usename is :" + username);
		System.out.println("The password is: " + password);
		System.out.println("The age is: " +  age);	
		System.out.println("The DOB is: " + DOB);
}
	@DataProvider(name="credentials")
	public Object [][] enterData(){
		
		Object[][] data = new Object[2][4];
		data [0][0]="editor";
		data [0][1]="Welcome1";
		data [0][2] = 20;
		data [0][3] = "04/26/1999";
		
		data [1][0]="editor2";
		data [1][1]="Welcome2";
		data [1][2] = 19;
		data [1][3] = "04/26/1999";
		
		return data;
	}
}
