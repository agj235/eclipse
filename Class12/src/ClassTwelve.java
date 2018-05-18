import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ClassTwelve {

	public static void main(String[] args) throws IOException {
		// Step 1
Properties myProp = new Properties();

//Step 2
//Provide the location of the properties file inside FileInputStream
FileInputStream src = new FileInputStream("/Users/angeljimenez/eclipse-workspace/Class12/src/configFile/myFile.properties");
	
	
	//Step 3
	myProp.load(src);
	
	if(myProp.getProperty("browser").equals("Firefox")) {
		System.setProperty("webdriver.gecko.driver", "/Users/angeljimenez/Downloads/geckodriver2");
	
	}else {
		System.setProperty("webdriver.chrome.driver", "/Users/angeljimenez/Downloads/chromedriver");
		
	}
	
	
	}

}
