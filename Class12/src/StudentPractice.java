import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class StudentPractice {

	public static void main(String[] args) throws IOException {
		Properties myProp = new Properties();
		
		FileInputStream file = new FileInputStream("/Users/angeljimenez/eclipse-workspace/Class12/src/configFile/StudentEx");
		
		myProp.load(file);
		System.out.println("URL: " + myProp.getProperty("url"));
		System.out.println("Username: " + myProp.getProperty("username"));

	}

}
